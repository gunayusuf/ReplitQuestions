package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tekrarList {
    public static void main(String[] args) {
        String str= "Javaisalsoeasy";
        String arr[]=str.split(""); // tüm harfleri arrayin içine attık
        Arrays.sort(arr);  // alfabetik sıralamaya koyduk
        List<String> list = new ArrayList<String>();//tekrarlayanları atacağımız yeni list oluşturduk
        for (int i=1; i<arr.length ; i++) { //tekrarlayanlar'ı yeni listemize ekledik
            if(!list.contains(arr[i]) && arr[i-1].equalsIgnoreCase(arr[i])){
                list.add(arr[i]);
            }
        }
        System.out.println("Tekrarlanan karakterler = "+list);
    }
}
