package ProjektWoche;

public class Solitär {
    public static void main(String[] args) {


        boolean[][] blattform = new boolean[5][5];
        ausgabeSpielfeld(blattform);
    }
    public static void ausgabeSpielfeld (boolean [][]array ){
        //sys
        //---
        // for | for
        // true #
        // false _
        System.out.println("\n  0 1 2 3 4");


        System.out.println("   ----------");

        for (int i = 0; i<5 ;i++){

            System.out.print(i+" " +"| ");

            for(int j=0 ; j<5 ;j++){


                array[i][j]=true;
                System.out.print(array[i][j] +" ");
            }
            System.out.println();
        }

    }
}
