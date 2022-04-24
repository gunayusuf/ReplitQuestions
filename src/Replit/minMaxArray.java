package Replit;

public class minMaxArray {
    public static void main(String[] args) {
        /*   Girdi olarak bir tamsayı dizisini kabul eden ve verilen diziden
             minimum ve maksimum sayıları yazdıran bir yöntem yazın

             Giriş : {3,2,5,4,1,6}

             Çıktı :

             dk: 1

             maksimum: 6

         */
        int arr[] = {3, 2, 5, 4, 1, 6,10,15,45,-1};
        int max = 0;
        int min = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                max=arr[i];
            }
            if(arr[i]<arr[i-1]){
                min=arr[i];
            }

        }
        System.out.println(max);
        System.out.println(min);


    }
}
