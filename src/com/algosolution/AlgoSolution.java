package com.algosolution;

public class  AlgoSolution {
     public static String FIND(int startindex, int endindex, String text) {

        String[] tableau = text.split("");
         String resultat="";
        for(int i = 0; i<tableau.length; i++) {

            if (i >=startindex && i<= endindex) {
                tableau[i] ="";
            }
             resultat+=tableau[i];
        }

         return resultat;
     }

    public static void main(String[] args) {
        System.out.print(FIND(0, 4, "hello word!"));
    }

}
