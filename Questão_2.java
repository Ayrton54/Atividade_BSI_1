package com.mycompany.atividade_vetores;

import javax.swing.JOptionPane;

public class Questão_2 {

     public static void main(String[] args) {
        int num[] = new int [20];
        String mostrar = " ";
        for ( int i=0 ; i<20 ; i++ ){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, " Entre com numeros "));
        }
        for (int j=19 ; j>=0 ; j--){
            mostrar += num[j] + " ";
        }
         System.out.println( mostrar );
        
    }
}
