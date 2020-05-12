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


    public static int MaximumNumber(int[] numbers) {
        int max = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (max<numbers[j]) {
                    max = numbers[j];
            }
        }
            return max;
        }



    public static int SecondMaximumNumber(int[] numbers) {
         int firstMaximum = 0;
        int secondMaximum=0;
        for (int j = 0; j < numbers.length; j++) {
            if (firstMaximum<numbers[j]){
                secondMaximum = firstMaximum;
                firstMaximum = numbers[j];
            }

            }

        return secondMaximum;
    }


    public static int returnSmallValue(int[] numbers){
        int j=0;
        int firstMinimum=numbers[j];

        for ( j=0;j<numbers.length;j++){
            if(firstMinimum>numbers[j]){
                firstMinimum=numbers[j];

            }
        }
        return firstMinimum;
    }



    public static void main(String[] args) {
        int[] numbers=new int[]{15,12,13,9,5,16,7,8};

        System.out.println(FIND(0, 4, "hello word!"));
        System.out.println(MaximumNumber(numbers));
        System.out.println(SecondMaximumNumber(numbers));
        System.out.print(returnSmallValue(numbers));

    }

}
