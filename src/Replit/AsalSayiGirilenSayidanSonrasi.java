package Replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AsalSayiGirilenSayidanSonrasi {
    public static void main(String[] args) {
        // Girdi olarak bir tamsayı kabul eden ve girdiden büyük ilk 10 asal
        // sayıyı ekrana yazdıran bir program yazınız.

        Scanner scan = new Scanner(System.in);
        System.out.print("sayı giriniz : ");
        int sayi = scan.nextInt();
        int sayac = 0;
        List<Integer>list=new ArrayList<>();
        while (sayac != 10) {
            sayi++;
            while (sayi % 2 != 0 && sayi % 3 != 0 && sayi % 5 != 0) {
                list.add(sayi);
                sayi++;
                sayac++;
            }
        }
        System.out.print(list);
    }
}


