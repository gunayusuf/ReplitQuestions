package Replit;

import java.util.Arrays;

public class ArrayTersineCevir {
    public static void main(String[] args) {
        //Array (tüm boşluklar ve özel karakterlerle) kullanarak bir cümleyi
        // tersine çeviren bir Java programı yazın.
        //
        //Girdi : Kodlama harika.
        //
        //Çıktı: .etaerg si gnidoC

        String str = "Kodlama harika.";

        String kelimeler [] = str.split("");

        String ters [] = new String [kelimeler.length];

        for (int i = 0; i < kelimeler.length ; i++) {

            ters[i]=kelimeler[kelimeler.length-1-i];
        }
        System.out.println(Arrays.toString(ters));
    }
}
