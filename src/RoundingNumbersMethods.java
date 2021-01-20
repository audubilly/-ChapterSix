import java.util.Scanner;

public class RoundingNumbersMethods {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of x: ");
         double x = input.nextDouble();

        roundToInteger(x);
        roundToTenths(x);
        roundToHundredths(x);
        roundToThousandths(x);

    }

    public static void roundToInteger(double x){
        double y;
        y = Math.floor(x * 10 + 0.5) / 10;
        System.out.println("value of y after rounding to integer position: " + y);
    }

    public static void roundToTenths(double x){
        double y;
        y = Math.floor(x * 100 + 0.5) / 100;
        System.out.println("value of y after rounding to tenths position: "+ y );
    }

    public static void roundToHundredths(double x){
        double y;
        y = Math.floor(x * 100 + 0.5) / 1000;
        System.out.println("value of y after rounding to hundredths position: "+ y );
    }
    public static void roundToThousandths(double x){
        double y;
        y = Math.floor(x * 100 + 0.5) / 10000;
        System.out.println("value of y after rounding to thousandths position: "+ y );
    }


}
