package com.mycompany.atividade_vetores;

import javax.swing.JOptionPane;

public class Questão_5 {
    public static void main(String[] args) {
        double porcento[] = new double[16];
        double c1=0,d1=0;
        String c =" ",d=" ";
        for(int i=0; i<16; i++){
            porcento[i] = Double.parseDouble(JOptionPane.showInputDialog(null, " Entre com numeros "));
        }
        for (int y=0 ; y<16 ; y+=2){
            c1 =porcento[y]*0.05 ;
            c +=porcento[y]+c1 +" ";
        }
        for(int e=1 ; e<16 ; e+=2){
            d1 =porcento[e]*0.02;
            d += porcento[e]+d1 + " ";
        }
        System.out.println( " Indices na posições impares com aumento de 5% \n"+c + 
                "\n\n Indices na posições pares com aumento de 2% \n "+d);
    }
}
