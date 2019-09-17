import java.util.Scanner;

public class Main {
    final float PI = 3.1415f;
    final long MAX_DISTANCE = 15l;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter any double?");
//        double frac = input.nextDouble();
//
//        System.out.printf("You have entered %.2f\n", frac);
        System.out.println(1.0f - 0.001f - 0.001f - 0.001f - 0.001f);
        System.out.println(5 / 2); //result 2
        System.out.println(5.0 / 2); //result 2

        System.out.println((2 + 1000) % 7);

        TemperatureConverter tempConverter = new TemperatureConverter();

//        System.out.println("Enter temperature in Farenheit?");
//        double f = input.nextDouble();
//        System.out.printf("Temperature in Celsius: %.2f\n", tempConverter.convertToCelcius(f));


        long ticks = System.currentTimeMillis(); //01.01.1970 00:00:00
        int hour = (int) (ticks / (1000 * 60 * 60)) % 24;
        int minutes = (int) ((ticks / (1000 * 60)) % (24*60) % 60) ;
        int i = 8;

        System.out.printf("%d\n", ticks);
        System.out.printf("%d:%d\n", hour, minutes);
        System.out.println(10*++i);

        int x = (int) 5.0f / 3;

        System.out.println(x);
        int value = 2147483647 + 1;
        System.out.println(value);
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);

        int x1 = 5;
        int x2 = 6;

        System.out.println((float) x1 / x2);
//        ArithmeticPuzzle.start();
//
//        System.out.println("Enter any year?");
//        boolean isLeap = LeapYearChecker.check(input.nextInt());
//        System.out.println("Is leap?: " + (isLeap?"yes":"no"));

//        GuessNumberGame.start();

        AverageCalculator.computeAverage();
    }
}
