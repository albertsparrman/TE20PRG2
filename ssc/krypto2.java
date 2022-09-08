public class krypto2 {
    public static void main(String[] args) {
        String str = "BINGUS BONGUS";
        String key = "fortnite";
        String copy = key;
        int wrdlgt = str.length();
        char[] array = new char[wrdlgt];
        char[] arr = new char[wrdlgt];

        System.out.println(str);
        for (int e = key.length(); e < str.length(); e+=e){
            key += copy;
            System.out.println(key);
        }
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
