import java.util.Scanner;

public class ArithmeticPuzzle {
    public static void start() {
        Scanner input = new Scanner(System.in);

        int x = (int) (Math.random() * 10 + 1); // 1 to 10
        int y = (int) (Math.random() * 10 + 1); // 1 to 10

        System.out.printf("What is %d + %d = ?\n", x, y);
        int sum = input.nextInt();

        System.out.println("Your answer is " + (sum==x+y));
    }
}
