package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listAharfiOlmayan {
    public static void main(String[] args) {
        /*Girdi olarak verilen listedeki isimlerden 'a' harflerini silen bir program yazınız.
        INPUT :
            list1={"Ali","Veli","Ayse","Fatma","Omer"}
        OUTPUT :
           [Veli,Omer]
         */
        List<String> list1 = new ArrayList<String>(Arrays.asList("Ali", "Veli", "Ayşe", "Fatma", "Omer"));
        List<String> aHarfiOlmayanlarList = new ArrayList<String>();
        for (String each : list1) {
            if (!each.toLowerCase().contains("a")) {
                aHarfiOlmayanlarList.add(each);
            }
        }
        System.out.println("A harfi olmayan isimler : " + aHarfiOlmayanlarList);
    }


}



