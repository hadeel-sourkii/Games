package ProjektWoche;

import java.util.Scanner;

public class messwerte_Aufgabe1 {
    public static void main (String []args ){
        Scanner sc = new Scanner (System.in);
        System.out.print("bitte Anzahl der Messwerte angeben ");

        int anzahl =sc.nextInt();
        System.out.print("bitte Messwerte eingeben");
        int []array =new int [anzahl];
        for ( int i =0 ; i<array.length ; i++){
            array [i]=sc.nextInt();

        }
        System.out.println("Maxwert :" + MaXX(array));
        System.out.println("Minwert :  "+ MiNN(array));

        System.out.println("Summe : " + Summe(array));
        System.out.println( "mittelWert ="+ MittelWert(array));
        System.out.print("befor Umkehr :  ");
        PrintArray(array);
        System.out.print("After Umkehr :  ");
        Umkehhrr(array);
        PrintArray(array );


    }

    public static int MaXX(int []array ){
        int max = array [0];
        for (int i= 0; i<array.length ; i++){
            if (max < array [i]){

                max =array [i];

            }
        }
        return max;
    }
    public static double MittelWert ( int []array ){
        int a = array.length;
        double mittel = 0;
        for (int i =0 ; i<array.length ; i++){

          mittel = Summe(array)/a;
        }
        return mittel;
    }
    public static int MiNN(int []array ){
        int min = array [0];
        for (int i= 0; i<array.length ; i++){
            if (min > array [i]){

                min =array [i];

            }
        }
        return min;
    }
    public static int Summe (int [] array ){
        int Sum= 0 ;
        for (int i : array){
            Sum += i;
        }
           return Sum;
    }

    public static void PrintArray (int []array ){
        for (int i =0 ; i<array.length ;i++){
            System.out.print(array [i]);
        }
        System.out.println();
    }
    public static void Umkehhrr(int []array ){
        for (int i =0 , j =array.length-1;i<array.length/2; i++ ,j--){
            int temp= array [i];
            array [i]=array [j];
            array [j]= temp;
        }

    }

}
