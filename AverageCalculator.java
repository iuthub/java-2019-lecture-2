import java.util.Scanner;

public class AverageCalculator {
    public static void computeAverage() {
        int total = 0;
        int num = 0;
        Scanner input = new Scanner(System.in);
        int curNumber;

        System.out.println("Enter your next input?");
        curNumber = input.nextInt();
        while (curNumber!=-1) {
            total += curNumber;
            num++;
            System.out.println("Enter your next input?");
            curNumber = input.nextInt();
        }
        System.out.printf("Average for total %d number entered is %.2f?", num, (float) total/num);
    }
}
