import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;



public class asciiArt {
    public static void main(String[] args) {
        HashMap<Character, String[]> asciiMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);


        for (char letter = 'A'; letter <= 'Z'; letter++) {
            asciiMap.put(letter, asciiLetters.getArt(letter));
        }

        System.out.println("welcome to the best text to ascii convertor!");
        System.out.println("enter text: ");
        String text = scanner.nextLine().toUpperCase();


        ArrayList<String> letterArray = new ArrayList<String>();

        for (int i = 0; i <text.length(); i++) {
            letterArray.add(String.valueOf(text.charAt(i)));
        }

        for (String s : letterArray){
            char c = s.charAt(0);
            String[] art = asciiMap.get(c);
            if (art != null) {
                for (String line : art) {
                    System.out.println(line);
            }
            System.out.println();
            } else {
                System.out.println("Invalid character; " + c);
            }


        }
        scanner.close();

    }

}
