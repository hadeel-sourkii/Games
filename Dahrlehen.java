package ProjektWoche;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Dahrlehen {
    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("#0.00");

        Scanner sc = new Scanner(System.in);
        System.out.print("dahrehen betrag (Euro)");
        double Dahrlehenbetrag=sc.nextDouble();
        System.out.print("jahrzinssatz in Prozent");
        double jahrzinssatz = sc.nextDouble();
        System.out.print("Annuitätsrate (Euro pro Jahr )");
        double Annuitätsrate = sc.nextDouble();
        System.out.printf("%s %15s %15s %15s \n ", "jahr ",     "zinsen"    ,    " Tilgung" ,     " Rest " );
        System.out.println("-------------------------------------------") ;
        int jahr =0 ;
        double zin=0;
        double til=0;
        double rest= Dahrlehenbetrag ;
        for (int i =1 ;rest>Annuitätsrate;i++ ){

            zin=(rest*jahrzinssatz)/100 ;

            til = Annuitätsrate -zin ;

            rest = rest-til ;

            jahr =i;
            System.out.printf("%d %15f %15f %15\n " ,i  ,zin ,til ,rest );
            System.out.println();
        }


    }
}
