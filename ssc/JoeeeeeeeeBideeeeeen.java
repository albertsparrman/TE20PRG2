import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JoeeeeeeeeBideeeeeen {
        public static void main(String[] args) {
            String data2 = null;
            String data = null;
            try {
                File myObj = new File("ssc/filename.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    data = myReader.nextLine();
                    System.out.println(data);
                }

                File myKey = new File("ssc/key.txt");
                Scanner myReader2 = new Scanner(myKey);
                while (myReader2.hasNextLine()) {
                    data2 = myReader2.nextLine();
                    System.out.println(data2);
                }
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            Scanner myObj = new Scanner(System.in);
            String str = data;
            String key = data2;
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
            for (int e = dinmor; e < strlength; e += dinmor) {
                key += copy;
            }
            System.out.println(key.length());
            for (int i = 0; i < str.length(); i++) {
                char ke = key.charAt(i);
                char ch = str.charAt(i);
                char beans = (char) (ch ^ ke);
                array[i] = beans;
            }
            System.out.println(array);

            for (int i = 0; i < str.length(); i++) {
                char ke = key.charAt(i);
                char be = array[i];
                char frid = (char) (be ^ ke);
                arr[i] = frid;
            }
            System.out.println(arr);

        }
    }

