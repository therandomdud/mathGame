import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean runner = true;
        Scanner scanner = new Scanner(System.in);

        while (runner) {
            System.out.println("Type start to yes or no to quit");
            String userInput = scanner.next();
            if (userInput.equalsIgnoreCase("yes")) {
                mathGame();
            }
            else {
                System.out.println("bye");
                runner = false;
            }

        }
    }

    public static void mathGame () {



    }





}
