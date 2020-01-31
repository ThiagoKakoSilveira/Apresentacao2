package teste;

public class NoArvore {
    int valor;
    NoArvore noEsquerda, noDireita;
    int maisAlto;

    public NoArvore(int valor) {
        this.valor = valor;
    }
    public static NoArvore raiz;

    public static void inserir(int valor) {
        inserir(raiz, valor);
    }

    public static void inserir(NoArvore node, int valor) {
        if (node == null) {
            System.out.println("Raiz " + valor);
            raiz = new NoArvore(valor);
        } else {
            if (valor < node.valor) {
                if (node.noEsquerda != null) {
                    inserir(node.noEsquerda, valor);
                } else {
                    System.out.println("Inserindo " + valor + " a esquerda de " + node.valor);
                    node.noEsquerda = new NoArvore(valor);
                }

            } else {
                if (node.noDireita != null) {
                    inserir(node.noDireita, valor);
                } else {
                    System.out.println("Inserindo " + valor + " a direita de " + node.valor);
                    node.noDireita = new NoArvore(valor);
                }
            }
        }
    }

    public static void preordem(NoArvore node) {
        if (node != null) {
            System.out.print(node.valor + ", ");
            preordem(node.noEsquerda);
            preordem(node.noDireita);

        }
    }

    public static void posordem(NoArvore node) {
        if (node != null) {

            posordem(node.noEsquerda);
            posordem(node.noDireita);
            System.out.print(node.valor + ", ");

        }

    }

    public static void ordem(NoArvore node) {
        if (node != null) {
            ordem(node.noEsquerda);
            System.out.print(node.valor + ", ");
            ordem(node.noDireita);

        }
    }


    public static void main(String[] args) {

        inserir(10);
        inserir(4);
        inserir(15);
        inserir(5);
        inserir(2);

    }

}
