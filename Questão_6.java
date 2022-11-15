package com.mycompany.atividade_vetores;

import javax.swing.JOptionPane;

public class Questão_6 {

    public static void main(String[] args) {
        int inverso[] = new int[20];
        int cont = 10;
        String mostrar = " ", n = "";
        for (int i = 0; i < 10; i++) {
            inverso[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "entre com numeros "));
            mostrar += inverso[i] + " ";
        }
        for (int y = 10; y < 20; y++) {
            cont--;
            inverso[y] = inverso[cont];
            n += inverso[y] + " ";
        }

        System.out.println( "Ordem de entrada: " + mostrar + "\n" + "Ordem inversa: " + n);

    }
}
