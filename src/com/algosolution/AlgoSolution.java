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


    public static int maximumNumber(int[] numbers) {
        int maximum = Integer.MIN_VALUE;
        for (int j = 0; j < numbers.length; j++) {
            if (maximum<numbers[j]) {
                maximum = numbers[j];


            }



        }
            return maximum;
        }


    public static int secondMaximumNumber(int[] numbers) {
         int firstMaximum =Integer.MIN_VALUE;
         int secondMaximum=0;
        for (int j = 0; j < numbers.length; j++) {
            if (firstMaximum <numbers[j]){
                secondMaximum = firstMaximum;
                firstMaximum = numbers[j];
            }

            }

        return secondMaximum;
    }



    public static int secondMaximumNumberSecondOption(int[] numbers) {
        int firstMaximum =Integer.MIN_VALUE;
        int secondMaximum=0;
        for (int j = 0; j < numbers.length; j++) {
            if (firstMaximum <numbers[j]){
                secondMaximum = firstMaximum;
                firstMaximum = numbers[j];
            } else {
                if (firstMaximum>numbers[j] && numbers[j]>secondMaximum) {
                    secondMaximum = numbers[j];
                }
            }
        }

        return secondMaximum;
    }


    public static int smallValue(int[] numbers){

        int firstMinimum=Integer.MAX_VALUE;

        for (int j=0;j<numbers.length;j++){
            if(firstMinimum>numbers[j]){
                firstMinimum=numbers[j];

            }
        }
        return firstMinimum;
    }


    public static int countmaximumNumber(int[] numbers) {
        int maximum = Integer.MIN_VALUE;
        int expectOutput=0;
        for (int j = 0; j < numbers.length; j++) {
            if (maximum<numbers[j]) {
                maximum = numbers[j];
                expectOutput=1;
            }
            else{
                if (maximum==numbers[j]){
                    expectOutput++;
                }

            }



        }
        return expectOutput;
    }



    public static void main(String[] args) {
        int[] numbers=new int[]{13,12,13,-9,5,13,7,13,7,13};

        System.out.println(FIND(0, 4, "hello word!"));
        System.out.println(maximumNumber(numbers));
        System.out.println(secondMaximumNumber(numbers));
        System.out.println(secondMaximumNumberSecondOption(numbers));
        System.out.println(countmaximumNumber(numbers));
        System.out.print(smallValue(numbers));

    }

}
