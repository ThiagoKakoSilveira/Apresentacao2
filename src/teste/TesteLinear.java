package teste;

import imutable.Aluno;

import java.util.Vector;

public class TesteLinear {
    public static void main(String[] args) {
        Vector vetor = new Vector();
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 100000; i++) {
            Aluno aluno = new Aluno("Pessoa "+i);
            vetor.add(aluno);
        }

        for (int i = 0; i < 100000; i++) {
            Aluno aluno = (Aluno) vetor.get(i);
            System.out.println(aluno.getNome());
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo em segundos = " + tempo);
    }
}
