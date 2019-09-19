import java.util.Scanner;

public class ArithmeticGame {
    public static void start(){
        Scanner input = new Scanner(System.in);
        int x = (int)(10*Math.random()); //0 to 9
        int y = (int)(10*Math.random()); //0 to 9

        System.out.printf("What is %d+%d=?\n", x, y);
        int answer = input.nextInt();
        if (answer==x+y) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
    }
}
