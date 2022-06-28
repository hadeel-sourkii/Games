package ProjektWoche;

public class CaiserChiffreee {
    public static char[] buchtaben = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    public static char[] buchtabenGross = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    static int verschiebung1;


    public static String verschiebung(String word)
    { // Hello
        String newWord = "" ;
        for (int i = 0 ; i< word.length();i++ )
        { // H    a   l   l    o
            for (int j = 0 ;j<buchtaben.length;j++)
            {
                if (word.charAt(i)==buchtaben[j])
                {
                    if (j<(buchtaben.length-1)-verschiebung1) {
                        newWord += buchtaben[j + verschiebung1];
                    }
                    else
                    {
                        // 22 - 26 +4
                        int x = j - (buchtaben.length) +verschiebung1 ;
                        newWord += buchtaben[x] ;


                    }



                }
                if (word.charAt(i)==buchtabenGross[j])
                {
                    if (j<(buchtabenGross.length-1)-verschiebung1) {
                        newWord += buchtabenGross[j + verschiebung1];
                    }
                    else {
                        // 22 - 26 +4
                        int x = j - (buchtabenGross.length) + verschiebung1;
                        newWord += buchtabenGross[x];


                    }
                }
            }
        }
        return newWord ;
    }
    public static String entschlussung (String word)
    {
        String newWord = "" ;
        for (int i = 0 ; i< word.length();i++ )
        {
            for (int j = 0 ;j<buchtaben.length;j++)
            {
                if (word.charAt(i)==buchtaben[j])
                {
                    if (j-verschiebung1>=0) {
                        newWord += buchtaben[j -verschiebung1];
                    }
                    else
                    {

                        int x = j + (buchtaben.length) -verschiebung1 ;
                        newWord += buchtaben[x] ;


                    }
                }
                if (word.charAt(i)==buchtabenGross[j])
                {
                    if (j-verschiebung1>=0) {
                        newWord += buchtabenGross[j -verschiebung1];
                    }
                    else
                    {

                        int x = j + (buchtabenGross.length) -verschiebung1 ;
                        newWord += buchtabenGross[x] ;


                    }
                }



            }
        }
        return newWord ;

    }





    public static void main(String[] args) {
        String s = "KdOor";
        verschiebung1 = 3;
        //System.out.println(verschiebung(s));
        System.out.println(entschlussung(s));

    }
}







