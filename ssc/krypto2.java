import java.util.Scanner;

public class krypto2 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String str = myObj.nextLine();
        String key = "fortnite";
        String copy = key;
        int dinmor = copy.length();
        int wrdlgt = str.length();
        char[] array = new char[wrdlgt];
        char[] arr = new char[wrdlgt];
        int spaceCount = 0;
        for (char c : str.toCharArray()) {
            if (c == ' ') {
                spaceCount++;
            }
        }

        int strlength = str.length() + spaceCount;

        System.out.println(strlength);

        System.out.println(str);
        for (int e = dinmor; e < strlength; e += dinmor){
            key += copy;
        }
        System.out.println(key.length());
        for (int i = 0; i < str.length(); i++){
            char ke = key.charAt(i);
            char ch = str.charAt(i);
            char beans = (char) (ch^ke);
            array[i]= beans;
        }
        System.out.println(array);

        for (int i = 0; i < str.length(); i++){
            char ke = key.charAt(i);
            char be = array[i];
            char frid = (char) (be^ke);
            arr[i]= frid;
        }
        System.out.println(arr);
    }
}