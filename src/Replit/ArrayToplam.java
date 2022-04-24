package Replit;

public class ArrayToplam {
    public static void main(String[] args) {
        /*Bir diziyi parametre olarak kabul eden ve dizideki tüm öğelerin
        toplamını döndüren bir yöntem yazın. Ardından sonucu ana yöntemde yazdırın.

           Örneğin :

           giriş : {1,2,3,4,5,6,7,8};

           çıktı: 36

         */

        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        arrToplamı(arr);

    }

    private static void arrToplamı(int[] arr) {
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];

        }
        System.out.println(toplam);

    }
}

