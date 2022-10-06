import java.sql.Struct;
import java.util.Scanner;

public class krypto {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        long a = Integer.parseInt(myObj.nextLine());
        String key = "3405";
        String copy = key;

        String b = Long.toString(a);
        int c = b.length();
        System.out.println(c);

        int e = key.length();
        System.out.println(e);

        if (e < c){
            key += copy;
        }
        long key2 = Long.parseLong(key);
        System.out.println(key2);
        long krypto = a^key2;
        System.out.println(krypto);
        System.out.println(krypto^key2);
    }
}
