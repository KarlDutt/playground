import java.util.HashMap;

public class asciiArt {
    public static void main(String[] args) {
        HashMap<Character, String[]> asciiMap = new HashMap<>();
        asciiMap.put('H', new String[] {
                "#     #",
                "#     #",
                "#######",
                "#     #",
                "#     #"
        });

        String[] asciiArtH = asciiMap.get('H');

        for (String line : asciiArtH) {
            System.out.println(line);
        }

    }

}
