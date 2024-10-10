package pancake;
import java.util.Arrays;
import java.util.Scanner;

public class pancakes {

    public static void main(String[] args) {

        // 1 muna 100 piim 200 jahu
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.println("How much milk do you have (ml): ");

        int milk_amount = scanner.nextInt() / 100;

        System.out.println("how many eggs do you have: ");
        int egg_amount = scanner.nextInt();

        System.out.println("How much flour do you have");
        int flour_amount = scanner.nextInt() / 200;

        int[] ingredients = { milk_amount, egg_amount, flour_amount };
        System.out.println(Arrays.toString(ingredients));
        // milk_amount = milk_amount / 100;
        // System.out.println(milk_amount);

        int smallest = ingredients[0];
        for (int i = 1; i < ingredients.length; i++) {
            if (ingredients[i] < smallest) {
                smallest = ingredients[i];
            }
        }
        System.out.println("You can create " + 3 * smallest + " pancakes");
    }
}
