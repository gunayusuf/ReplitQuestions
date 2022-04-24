package Replit;

import java.util.Arrays;

public class ArrayDonustur {

    public static void main(String[] args) {
	/*Özel bir dönüş türü oluşturma yöntemi, bir adı parametre
        olarak kabul eder ve adı bir karakter dizisi olarak yazdırır.

        (toCharArray() yöntemini kullanmayın)

        Girdi: John

        Çıktı :[J, o, h, n]

         */
        String str = "John";

        String arr[] = str.split("");

        System.out.println(Arrays.toString(arr));
    }
}

