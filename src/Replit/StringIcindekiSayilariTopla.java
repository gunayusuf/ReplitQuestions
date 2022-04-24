package Replit;

public class StringIcindekiSayilariTopla {
    public static void main(String[] args) {
        //Bir String'i parametre olarak kabul eden ve verilen string'de bulunan
        // rakamların toplamını yazdıran bir metot yazın.
        //
        //girdi: ade1r4d3
        //
        //çıktı : 8
        //
        //Hint :
        //     Use Character.isDigit()
        //     Integer.valueOf()

        String str = "ade1r4d3";

        rakamlariTopla(str);
    }

    private static void rakamlariTopla(String str) {

        str = str.replaceAll("\\D", "");
        System.out.println(str);
        int strSayi = Integer.parseInt(str);
        int rakam = 0;
        int rakamlarTopla=0;
        while(strSayi>0) {

            rakam = strSayi%10;
            rakamlarTopla+=rakam;
            strSayi/=10;



        }
        System.out.println(rakamlarTopla);

    }
}
