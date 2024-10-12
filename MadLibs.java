import java.util.Scanner;
import java.util.ArrayList; // import the ArrayList class
import java.util.Arrays;

public class MadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> questions = new ArrayList<>(Arrays.asList("noun", "adjective", "verb"));

        for (int i = 0; i < 6; i++) {
            System.out.println("Write " + questions.get(i % 3) + ": ");
            String input1 = scanner.nextLine();
            words.add(input1);
        }
        System.out.println(words);

        String story = "The " + words.get(0) + " was very " + words.get(1) + ". It loved to " + words.get(2) +
                ". One day, a " + words.get(4) + " " + words.get(3) + " appeared, and together they started to "
                + words.get(5) +
                ". What a day full of surprises!";

        System.out.println("\nHere's your Mad Libs story:");
        System.out.println(story);
    }

}
