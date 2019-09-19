import java.util.Scanner;

public class AverageCalculator {
    public static void start(){
        Scanner input = new Scanner(System.in);

        int total = 0;
        int count = 0;
        int nextEntry;

        System.out.println("Enter your number?");
        nextEntry = input.nextInt();
        while(nextEntry!=-1){
            total+=nextEntry;
            count++;
            System.out.println("Enter your number?");
            nextEntry = input.nextInt();
        }
        System.out.printf("Average: %.2f\n", (double)total/count);
    }
}
