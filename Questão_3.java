
package com.mycompany.atividade_vetores;

import javax.swing.JOptionPane;


public class Questão_3 {

   
    public static void main(String[] args) {
        int num[] = new int [20];
        String n = " ",n1 = " ",n2= " ";
        for ( int i=0 ; i<20 ; i++ ){
            num[i] = Integer.parseInt(JOptionPane.showInputDialog(null, " Entre com numeros "));
            n1+=num[i] + " ";
        }
        for (int y=19 ; y>=0 ; y--){
            n += num[y] + " ";
        } 
        for(int r=0; r<20; r++){
            n2="Ordem de entrada = \n"+ n1 +"\n\n Ordem inversa = \n" + n ;
        }
        System.out.println(n2);
      }
}
