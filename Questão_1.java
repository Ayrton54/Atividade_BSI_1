package com.mycompany.atividade_vetores;

public class Questão_1 {

    public static void main(String[] args) {
        int qua[] = new int[31];
        int c = 1, res;
        String mostrar = " ";
        qua[0] = 0;
        qua[1] = 1;
        for (int i = 2; i < 31; i++) {
            c++;
            res = c * 2;
            qua[i] = res;
            mostrar += qua[i] + " ";
        }

        System.out.println(qua[0] + " " + qua[1] + mostrar);
    }
}
