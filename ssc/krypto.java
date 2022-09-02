public class krypto {
    public static void main(String[] args) {
        int a = 6527;
        System.out.println(Integer.toBinaryString(a));
        int key = 3405;
        System.out.println(Integer.toBinaryString(key));
        int krypto = a^key;
        System.out.println(Integer.toBinaryString(krypto));
        System.out.println(Integer.toBinaryString(krypto^key));
    }
}
