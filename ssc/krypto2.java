public class krypto2 {
    public static void main(String[] args) {
        String str = "Dagens dag var en fin dag det var en himmel skiten börjde brinna va fan hur tänkte du gud här det är nästan som att man trodde att en fantastisk mango verkade bakom hela saken ingen kunnde någonsin förstoa på en toa seeesh vad i hela jävla helvete ska man skriva sa gandalf sjuka tidet var nära och det leder till en stor explosion av jesus hora shit jag blir typ lite rädd när jag tänket på allla saker som jesus hade tänkt för alla inom denna plan hory shit va fan slut amen ;). Vi trodde att jesus inte skulle komma med sådanta starka krafter nästan so om att han skulle vara extremt cool detta var helt jävla sjukt vem visste att han var hela 9 år jag var jesus av toppen men sedan blev jag ner slagen av rapparen maxico helt jävla sjuk nästan som att en haj attackerade med blood helvete ska du veta inte ens jesus kunde uppfatta att butiken skulle vara stängd på söndagar vem fan stänger söndagar va i helvete tänkte jesus här nästan som att en våg av framtiden skulle slupa upp en hela korv som faktiskt kom från den största korv mannen istockholm hörde att han blev av med sin license att sälja korv efter att han blev en val som faktiskt inte finns i havet detta var helt jävla galet tänk att träden fanns i elden vem  hur och vad det frågade vi alla i stunden jag menar ve mskulle köra 3 chockladbollar för 8 kr helt galet men jag menar att det är ett dålgit pris är en annan sak. Jag tror att denna sak verkligen inte funkade in i stadens centrum nästan som att faktiskt funkade liksom vem skulle köpa en haj till jesus för fan skiten är ju ful gud önskade att framtiden inte funkade på samma sätt detta ledde till ett misstag av typ normer som ledde till negativa utgångs punkter detta var ju helt fan inte okej nästa som en fantastisk jorgubbe nu jag vara klar för i helevete be till jesus annars blir dett slagsmål";
        String key = "fortnite";
        String copy = "fortnite";
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


//Dagens dag var en fin dag det var en himmel skiten börjde brinna va fan hur tänkte du gud här det är nästan som att man trodde att en fantastisk mango verkade bakom hela saken ingen kunnde någonsin förstoa på en toa seeesh vad i hela jävla helvete ska man skriva sa gandalf sjuka tidet var nära och det leder till en stor explosion av jesus hora shit jag blir typ lite rädd när jag tänket på allla saker som jesus hade tänkt för alla inom denna plan hory shit va fan slut amen ;)