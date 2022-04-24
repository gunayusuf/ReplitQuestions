package Replit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class asal {
    public static void main(String[] args) {
        int sayac = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        List<Integer> asalYeni = new ArrayList<>();

        for (int sayi = scan.nextInt(); sayi <= 100000; sayi++) {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    kontrol = 1;
                    break;
                }
            }

            if (kontrol == 0) {
                asalYeni.add(sayi);
                sayac++;
                if (sayac == 10) {
                    break;
                }
            }
        }
        System.out.print(asalYeni);

    }
}

