import java.util.Scanner;

public class InputCollector {

    // Asks the user for 6 words and returns them in order
    // noun, verb, adjective, noun, verb, adjective
    public static String[] collectWords() {
        Scanner input = new Scanner(System.in);
        String[] words = new String[6];

        System.out.print("Enter a noun: ");
        words[0] = input.nextLine();

        System.out.print("Enter a verb: ");
        words[1] = input.nextLine();

        System.out.print("Enter an adjective: ");
        words[2] = input.nextLine();

        System.out.print("Enter another noun: ");
        words[3] = input.nextLine();

        System.out.print("Enter another verb: ");
        words[4] = input.nextLine();

        System.out.print("Enter another adjective: ");
        words[5] = input.nextLine();

        return words;
    }
}
