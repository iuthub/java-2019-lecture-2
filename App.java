import java.util.Scanner;

public class App {
    public final double PI = 3.1415;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
////        System.out.println("Enter a double value?");
////        double d = input.nextDouble();
//        System.out.printf("You entered %.2f\n", 0.33333f);
//        System.out.printf("Some integer %d\n", 2147483648l);
//        System.out.println("5/2=" + (5 / 2)); //2
//        System.out.println("5/2.0=" + (5 / 2.0)); //2.5
//        System.out.println((4 + 1000) % 7);
//
////        System.out.println("Enter a temperature in Farenheit?");
////        double f = input.nextDouble();
////        System.out.printf("Celsius: %.2f\n", TemperatureConverter.convertToCelsius(f));
//        int i = 1;
//        System.out.println(CurrentTime.get());
//        System.out.println(++i + i); //4
//        i = 1;
//        System.out.println(i++ + i); //3
//
//        int x = 5;
//        double y = 2;
//        double z = x / y; //2
//
//        System.out.println(2147483647 + 1);
//        System.out.println(1.0 - (0.1 + 0.1 + 0.1 + 0.1 + 0.1));
//
////        ArithmeticGame.start();
//
//        x=4;
//        System.out.println((x % 2 == 0) ^ (x % 3 == 0)); //true


//        System.out.println("Enter a year?");
//        int year = input.nextInt();
//        System.out.printf("Is Leap year: %s\n", LeapYearChecker.check(year));

//        int a=1,b=2,c=3;
//
//        System.out.println(a=b+=c=5);

//        GuessNumberGame.start();

//        AverageCalculator.start();

        System.out.println(EstimatePI.estimate(1000000));
    }
}
