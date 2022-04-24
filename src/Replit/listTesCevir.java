package Replit;

import java.util.Scanner;

public class listTesCevir {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir cümle alın. Kullanıcıdan alınan cümleyi parametre olarak kabul edin,
        Array kullanarak cümleyi ters çevirin ve sonucu ana metoda String olarak döndüren bir Method yazın.
        Not: Büyük ve küçük harfler, boşluklar ve özel karakterler değiştirilmeyecektir.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz : ");
        String str = scan.nextLine();
        System.out.println(cumleyiTersCevir(str));
    }
    private static String cumleyiTersCevir(String str) {
        String arr[] = str.split("");
        String ters = "";
        for (int i = arr.length-1; i >= 0; i--){
            ters+=arr[i];
        }
        return ters;
    }
}
