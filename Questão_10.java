package com.mycompany.atividade_vetores;

import javax.swing.JOptionPane;

public class Questão_10 {
   public static void main(String[] args) {
        int cont =6;
        for(int y=13; y<1001; y++){
         if((y%2>=1)&&(y%3>=1)&&(y%5>=1)&&(y%7>=1)&&(y%11>=1)&&(y%13>=1)&&(y%17>=1)&&(y%19>=1)&&(y%23>=1)){
             cont++;
         }
         
        }
        JOptionPane.showMessageDialog(null, "De 1 a 1000 existem "+cont+" numeros primos");
        
        
        
    }
}
