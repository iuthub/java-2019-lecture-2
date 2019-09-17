import java.util.Scanner;

public class GuessNumberGame {

    public static void start() {
        int x = (int)(Math.random()*100 + 1); // 1 to 100
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your guess?");
        int guess = input.nextInt();
        while(guess!=x){
            if (guess<x)
                System.out.println("Your guess is less");
            else
                System.out.println("Your guess is more");

            System.out.println("Enter your guess?");
            guess = input.nextInt();
        }
        System.out.println("Congratulations!. You won!");
    }

}
