import java.util.Scanner;

public class GuessNumberGame {

    public static void start(){
        Scanner input = new Scanner(System.in);
        int x = (int)(100*Math.random()); //0 to 99

        System.out.println("Enter your guess?");
        int guess = input.nextInt();
        while(guess!=x){
            System.out.printf("Your number is %s\n", (guess>x)?"greater":"less");
            System.out.println("Enter your guess?");
            guess = input.nextInt();
        }
        //guess==x
        System.out.println("Congratulations. You won!");
    }

}
