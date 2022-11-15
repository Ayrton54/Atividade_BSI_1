
package com.mycompany.atividade_vetores;

import javax.swing.JOptionPane;


public class Questão_4 {

        public static void main(String[] args) {
        int num[] = new int[30];
        String imp = " ";
        for(int w=0 ; w<30 ; w++){
            num[w] = Integer.parseInt(JOptionPane.showInputDialog(null, " Entre com numeros "));
        }
        for( int e=0 ; e<30; e+=2){
            imp+=num[e]+" ";
        }
            System.out.println("Números presentes nos indices impares = \n"+ imp );
    }
}
