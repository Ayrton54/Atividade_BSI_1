package com.mycompany.atividade_vetores;

import javax.swing.JOptionPane;

public class Questão_7 {

    public static void main(String[] args) {
        int vetor[][] = new int[3][5];

        String m3 = " ", m2 = " ", m1 = " ";
        for (int i = 0; i < 2; i++) {
            for (int y = 0; y < 5; y++) {
                vetor[i][y] = Integer.parseInt(JOptionPane.showInputDialog(null, " Entre com numeros "));
            }
        }
        for (int t = 0; t < 5; t++) {
            vetor[2][t] += vetor[0][t] + vetor[1][t];
            m1 += vetor[0][t] + " ";
            m2 += vetor[1][t] + " ";
            m3 += vetor[2][t] + " ";
        }

        System.out.println( " 1º linha = " + m1 + "\n2º linha = " + m2 + "\nSoma das 2 linhas     = " + m3);
    }
}
