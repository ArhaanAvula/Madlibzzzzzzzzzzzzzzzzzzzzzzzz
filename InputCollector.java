
import java.util.Scanner;

public class InputCollector {

    // Asks the user for 6 words and returns them in story order
    // Word order: adjective, noun, noun, verb ending in -ing, noun, adjective
    public static String[] collectWords() {
        Scanner input = new Scanner(System.in);
        String[] words = new String[6];

        System.out.print("Enter an adjective: ");
        words[0] = input.nextLine();

        System.out.print("Enter a noun: ");
        words[1] = input.nextLine();

        System.out.print("Enter another noun: ");
        words[2] = input.nextLine();

        System.out.print("Enter a verb ending in -ing: ");
        words[3] = input.nextLine();

        System.out.print("Enter another noun: ");
        words[4] = input.nextLine();

        System.out.print("Enter another adjective: ");
        words[5] = input.nextLine();

        return words;
    }
}
