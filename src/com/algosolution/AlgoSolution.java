package com.algosolution;



public class AlgoSolution {
    public static void FIND(int Start, int End, String Text) {
        String[] MonTableau = Text.split("");

        for(int i = 0; i < MonTableau.length; ++i) {
            if (i >= Start && i <= End) {
                MonTableau[i] = "";
            }

            System.out.print(MonTableau[i]);
        }

    }

    public static void main(String[] args) {
        FIND(7, 16, "la programation est important");
    }

}
