package teste;

import java.util.*;

public class Estruturas {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        pilha.push("Item inserido na pilha");

        LinkedList<String> listaEncadeada = new LinkedList();


        listaEncadeada.add("Insere no fim");
        listaEncadeada.addFirst("Insere no começo");
        listaEncadeada.add(2,"Insere na quarta posição");
        listaEncadeada.addLast("Insere na última posição");

        Vector<String> vetor = new Vector<>(); //esta é thread-safe
        vetor.add("Insere no final por padrão");
        vetor.add(0, "Insere em primeiro mas é mais custoso");
        vetor.add(0, "Vai inserir em primeiro e correr novamente os outros");
        vetor.add(1, "Vai colocar em segundo e correr os demais para trás");
        vetor.add(4, "Insere na posição 4");
        vetor.add(4, "Esse que fica na quarta");

        for (int i = 0; i < vetor.size(); i++){
            System.out.println(vetor.get(i));
        }

        ArrayList vetorMaisUsado = new ArrayList();
        vetorMaisUsado.add("A única diferença ");
    }
}
