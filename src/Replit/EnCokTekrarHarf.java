package Replit;

public class EnCokTekrarHarf {
    public static void main(String[] args) {
        /*
        Kullanıcıdan girdi olarak bir Dize almak için bir Java programı yazın
        ve bu dizede oluşan maksimum karakteri bulun. (Büyük/küçük harf duyarlılığını yoksay)

          giriş:

          Java öğrenmek kolaydır

          çıktı:

          oluşan maksimum karakter: a
         */
        String str = "Java öğrenmek kolaydır";
        String arr[] = str.split("");
        String enCokTekrarEden = "";
        int maxSayac = 0; // en çok kullananı vericek
        int sayac = 1;
        for (int i = 0; i < arr.length; i++) { // karşılaştırılan karakter kontrol
            for (int j = i + 1; j < arr.length; j++) {// karşılaştıran karakter kontrol
                if (arr[i].equalsIgnoreCase(arr[j])) {// eşit karakterlerin kontrolu yapılıp
                    // true durumunda sayaç arttırılarak eşit karakterler saydırıldı
                    sayac++;
                }
            }
            if (sayac > maxSayac) {
                maxSayac = sayac; // hangi harfte en çok tekrar edeni bulunca arr[i] yi encoktekraredene gönderdik
                enCokTekrarEden = arr[i];
            } else if (sayac == maxSayac) {
                enCokTekrarEden += ", " + arr[i];// aynı harften birden fazla varsa bu devreye girecek
            }
            sayac = 1; // her bir harften sonra sayacı sıfırlıyoruz
        }

        System.out.println("En çok tekrar eden karakter : " + enCokTekrarEden + " --> " + maxSayac + " tane var");


    }
}

