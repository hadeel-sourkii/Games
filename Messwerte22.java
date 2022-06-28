package ProjektWoche;
import java.util.Scanner;
public class Messwerte22 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.print("bitte Anzahl der Messwerte eingeben?");
        int Anzahl = sc.nextInt();
        int array []= new int [Anzahl];
        for (int i =0 ; i<array.length ; i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Maxxwert" +" " +MaXX(array )  );
        System.out.println( "Miniwert :" + " " + MiNN(array) );
        System.out.println("Summe :" + " "+  Summe(array));
        System.out.println(   "MittelWert :"+ " " +  MittelWert(array) );
        PrintArray(array);
         Umkehr(array);


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
    public static int MiNN(int []array ){
        int min = array [0];
        for (int i= 0; i<array.length ; i++){
            if (min > array [i]){

                min =array [i];

            }
        }
        return min;
    }
    public static int Summe (int []array){
        int Summ=0;
        for (int i=0 ; i<array.length ;i++){
            Summ+=array[i];
        }
        return Summ;
    }
    public static double MittelWert(int []array ){
        return Summe(array)/array.length;
    }
    public static void PrintArray (int []array ){
        for (int i =0 ; i<array.length ;i++){
            System.out.print(array [i] + " ");
        }
        System.out.println();
    }
    public static void Umkehr (int []array ){
        for (int i=array.length-1 ; i>= 0 ; i--){
        System.out.print(array[i]+ " ");
        }
        System.out.println();
    }
}
