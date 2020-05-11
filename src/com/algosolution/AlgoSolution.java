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
            if (firstMaximum<numbers[j])  {
                secondMaximum = firstMaximum;
                firstMaximum = numbers[j];
            }
            else {
                if (firstMaximum>numbers[j] && secondMaximum<numbers[j]){
                    secondMaximum = numbers[j];

            }
        }
            }

        return secondMaximum;
    }



    public static void main(String[] args) {
        int[] numbers=new int[]{1,12,13,4,5,6,7,8};

        System.out.println(FIND(0, 4, "hello word!"));
        System.out.println(MaximumNumber(numbers));
        System.out.print(SecondMaximumNumber(numbers));

    }

}
