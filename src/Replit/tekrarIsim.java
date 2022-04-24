package Replit;

import java.util.ArrayList;
import java.util.List;

public class tekrarIsim {
    public static void main(String[] args) {
        /*
        İki String Dizisi arasındaki ortak öğeleri bulan bir program yazın (büyük/küçük harf duyarlılığı olmadan)

        Girdi1 : {John,Brad,Ange,Sofia,Emily}

        Girdi2 : {sofya,brad,zarafet,emily,hazel}

        Çıktı: [sofya,brad,emily]
         */
        String arr1[] = {"John", "Brad", "Ange", "Sofia", "Emily"};
        String arr2[] = {"sofia", "brad", "zaro", "emily", "hazel"};
        //String arr3[] = {"John", "Brad", "Ange", "Sofi", "Emily", "sofia", "brad", "zaro", "emily", "hazel"};
        //List<String> list1 = new ArrayList<>(Arrays.asList("John", "Brad", "Ange", "Sofia", "Emily"));
        //List<String> list2 = new ArrayList<>(Arrays.asList("Johnson", "brad", "fenge", "sofia", "emily"));
        List<String> list3 = new ArrayList<>();
        String sonuc = "";

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equalsIgnoreCase(arr2[j])) {
                    System.out.print(arr1[i]+" ");


                }

            }

        }

    }


}

