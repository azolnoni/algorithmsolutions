package com.returnhightnumbersolution;

public class ReturnHightNumberSolution {

    public static int returnHightNumber(){
        int resultat=0;
     int[] numbers=new int[]{3000,150,700,9,2000,500,1500,4,30000};
        int k=0;
        int i=0;

     for (int j=i+1;j<numbers.length;j++){
         if(numbers[i]<numbers[j]){
            i=i+1+k;

         }
         else {
             i=i;
             k++;


         }
         resultat=numbers[i];
        }
        return resultat;
    }

    public static void main(String[] args) {
        System.out.print(returnHightNumber());
    }
}
