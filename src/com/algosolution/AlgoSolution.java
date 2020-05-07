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
        int max1 = 0;
        int max2 = 0;
        for (int j = 0; j < numbers.length; j++) {
            if (max1 < numbers[j] && max2 < numbers[j]) {
                if (max2 > max1) {
                    max1 = max2;
                    max2 = numbers[j];
                } else {
                    max2 = max1;
                    max1 = numbers[j];
                }
            } else {
                if (max1 > numbers[j] && max2 < numbers[j]) {
                    max2 = numbers[j];
                } else {
                    if (max1 < numbers[j] && max2 > numbers[j]) {
                        max1 = max2;
                    }
                }
            }
        }
        return max2;
    }


    public static void main(String[] args) {
        int[] numbers=new int[]{9000000 ,150,70000000,8000000,2000,500,1500,4,30000000};

        System.out.println(FIND(0, 4, "hello word!"));
        System.out.println(MaximumNumber(numbers));
        System.out.print(SecondMaximumNumber(numbers));

    }

}
