package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listteYerDeğiştirme {
    public static void main(String[] args) {
        // 10 elemanlı bir liste oluşturun. 8. öğeyi 3. öğeyle değiştirin.

        String[] names = {"Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"};
        List<String> list = new ArrayList<>(Arrays.asList("Umit", "Emin", "Kemal", "Kerem", "Taylan", "Orhan", "Sinan", "Furkan", "Ahmet", "Ali"));
        System.out.println(list);
        list.set(2, "Furkan");
        list.set(7, "Kemal");
        System.out.println(list);
    }
}

