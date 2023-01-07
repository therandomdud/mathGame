import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean runner = true;
        Scanner scanner = new Scanner(System.in);

        while (runner) {
            System.out.println("Type yes to start or no to quit");
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
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("To quit type quit");
        int num1,num2;
        while (true) {
            num1 = random.nextInt(20);
            num2 = random.nextInt(20);
            System.out.println(num1 + " + " + num2);
            String input;

            input = scanner.next();


            if (input.equalsIgnoreCase("quit")) {
                break;
            }
            inputCorrect(input,num1,num2);


        }


    }

    public static void inputCorrect (String input,int num1,int num2) {
    try {
        if (Integer.parseInt(input) == num1 + num2) {
            System.out.println("correct");
        } else {
            int result = num1 + num2;
            System.out.println("not correct the result is " + result);
        }
    } catch (Exception e) {
        System.out.println("number as input needed try again");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        if (userInput.equalsIgnoreCase("quit")) {
            return;
        }
        inputCorrect(userInput,num1,num2);
    }

    }




}
