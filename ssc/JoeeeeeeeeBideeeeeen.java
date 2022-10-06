import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class JoeeeeeeeeBideeeeeen {
        public static void main(String[] args) {
            String data2 = "";
            String data = "";
            int bingus = 1;
            try {
                File myObj = new File("ssc/filename.txt");
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    if(bingus == 1) {
                        data += myReader.nextLine();
                    }
                    else {
                        data += " //" + myReader.nextLine();
                    }
                    bingus += 1;
                }

                File myKey = new File("ssc/key.txt");
                Scanner myReader2 = new Scanner(myKey);
                while (myReader2.hasNextLine()) {
                    data2 = myReader2.nextLine();
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



            for (int e = dinmor; e < strlength; e += dinmor) {
                key += copy;
            }
            for (int i = 0; i < str.length(); i++) {
                char ke = key.charAt(i);
                char ch = str.charAt(i);
                char beans = (char) (ch ^ ke);
                array[i] = beans;
            }

            for (int i = 0; i < str.length(); i++) {
                char ke = key.charAt(i);
                char be = array[i];
                char frid = (char) (be ^ ke);
                arr[i] = frid;
            }
            System.out.println(data);
            System.out.println(data2);
            System.out.println(array);
            System.out.println(arr);

        }
    }

