package Replit;

public class tekrarlananList {
    public static void main(String[] args) {
        String str = "Javaisalsoeasy";
        System.out.println(str);
        String[] arr = str.split("");
        String strYeni="";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j]) && ((!strYeni.contains(str.charAt(i) + "")))) {
                    strYeni += str.charAt(i) + " ";
                }
            }
        }
        System.out.println(strYeni);
        System.out.println();
    }
}
