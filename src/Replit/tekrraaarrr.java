package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class tekrraaarrr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz : ");
        String str = scan.nextLine();
        String arr[] = str.split("");
        Arrays.sort(arr);
        List<String> list = new ArrayList<String>();
        int sayac = 0;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1].equalsIgnoreCase(arr[i])&&!list.contains(arr[i])){
                list.add(arr[i]);
            }
        }
        String cumle = "";
        for (String w:list) {
            cumle+=w+" ";
        }
        System.out.println("Tekrar eden harfler : "+cumle);
        //System.out.println(list);
    }
}
