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



    public static int HightNumber(int[] numbers){

        int max=0;

        for (int j=0;j<numbers.length;j++){
            if(max<numbers[j]){
                max=numbers[j];
            }
        }
        return max;
    }




    public static void main(String[] args) {
        int[] numbers=new int[]{94000 ,150,70000,9,2000,500,1500,4,30000};

        System.out.println(FIND(0, 4, "hello word!"));
        System.out.print(HightNumber(numbers));

    }

}
