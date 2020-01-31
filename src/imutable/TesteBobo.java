package imutable;

public class TesteBobo {
    public static void main(String[] args) {
        String nome = "Thiago";
        adicionaSobrenome(nome);
        System.out.println(nome);
    }
    public static void adicionaSobrenome(String nome){
        nome+="Silva";
    }
}
