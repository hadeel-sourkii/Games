package ProjektWoche;
import java .util.Scanner;
public class CaesarChiffre_2 {

public static void main (String []args ){
    Scanner sc =new Scanner (System.in);




    System.out.println("bitte wählen sie");
    int Auswahl;


    do{
        System.out.println("CaesarChiffre");
        System.out.println("(1) Eingabe KlarText");
        System.out.println("(2)Eingabe GeheimText");
        System.out.println("(3) Verschiebung");
        System.out.println("(4) verschlusseln ");
        System.out.println("(5) Entschlusseln ");
        System.out.println("(6) Entschlusseln Durschlauf");
        System.out.println("7: Ende");

        Auswahl=sc.nextInt();
        switch(Auswahl){
            case 1: String Text;
                System.out.println("(1) Eingabe KlarText"+"\n"+ "bitte geben sie Text ein");
                Text=sc.next();
                break;
            case 2: String Gtext;
                System.out.println("GeheimTextt");
                 Gtext=sc.next();
                break;
            case 3: int stelle;
                System.out.println("Verschiebung :");
                  stelle =sc.nextInt();
                break;
            case 4: int vStelle;
                System.out.println("verschlussen :");
                vStelle =sc.nextInt();

                break;
            case 5: int EntStelle;
                System.out.println("Enschlusseln :");
                EntStelle =sc.nextInt();
                break;
            case 6:
                System.out.println("Enschlusseln Durschlauf1 :");
                break;
            case 7: System.out.println("Programm ist zu Ende ");
                break;


        }

    }while(Auswahl!=7);
}


public static String Verschlusseln (int n ){
    String Chifre="a b c d e f g h i j k l m n o p q r s t u v w x y z";
   String erg= null ;

   for (int i =0 ; i<Chifre.length(); i++){

   }






       return erg;
}
}
