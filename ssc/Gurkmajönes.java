import java.util.Random;
import java.util.Scanner;

public class Gurkmajönes {
    public static void main(String[] args) {
        Scanner svara = new Scanner(System.in);
        System.out.println("Hej och välkommen till en väldigt seriös läkartjänst. Jag är din terapeut Rasmus Rasmusson den femtitredje, vad söker du hjälp för idag.");

        String DemSvar = svara.nextLine();

        String[] list = {"Bättra dig själv",};

        List<String> myList = Arrays.asList("A", "B", "C", "D");

        Random r = new Random();

        int randomitem = r.nextInt(myList.size());
        String randomElement = myList.get(randomitem);
    }
}
