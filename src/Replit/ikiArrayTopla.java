package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ikiArrayTopla {
    public static void main(String[] args) {
        /*
        2 tamsayı Diziyi parametre olarak kabul eden ve yeni bir
        Diziye 2 dizi ekleyen ve yazdıran bir dönüş yöntemi yazın.

            Girdi1={1,2,3,4}

            Giriş2={5,6}

            Çıktı={1,2,3,4,5,6}
         */

        int arr1[] = {1, 2, 3, 4};
        int arr2[] = {5, 6};
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(5, 6));
        list1.addAll(list2);
        System.out.println(list1);

        //int arrTopla[] = new int[arr1.length+arr2.length];
        //System.arraycopy(arr1, 0, arrTopla, 0, arr1.length);
        //System.arraycopy(arr2, 0, arrTopla, arr1.length, arr2.length);
        //System.out.println(Arrays.toString(arrTopla));

    }
}

