package Replit;

import java.util.Arrays;

public class ortalamaArray {
    public static void main(String[] args) {
         /* Dizi elemanlarının ortalama değerini hesaplayan ve ortalamanın üstü
         olanları yazdıran bir java programı yazınız.

                girdi[]= {1,2,3,4,5,6,7}

        Çıkış : 4

        */
        int arr []={1,2,3,4,5,6,7};
        int toplam = 0;
        int ortalama = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam+=arr[i];
            ortalama=toplam/arr.length;

        }
        System.out.println(ortalama);
        int arr1[]=new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            if(ortalama<arr[i]){
                arr1[i]+=i;


            }
        }
        System.out.print(Arrays.toString(arr1));
    }
}
