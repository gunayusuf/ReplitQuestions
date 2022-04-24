package Replit;

public class SayiyiTerstenYaz {
    public static void main(String[] args) {
        //Sayıyı tersine çevirmek için bir dönüş yöntemi yazın.

        int sayi = 123;

        terstenSayi(sayi);
    }

    private static void terstenSayi(int sayi) {
        int rakam = 0;
        while (sayi > 0) {
            rakam = sayi % 10;
            System.out.print(rakam);
            sayi /= 10;

        }
    }
}