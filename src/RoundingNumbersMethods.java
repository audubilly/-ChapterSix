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

    public static double roundToInteger(double x){
        double y;
        y = Math.floor(x * 10 + 0.5) / 10;
        System.out.println("value of y after rounding to integer position: " + y);
        return y;
    }

    public static double  roundToTenths(double x){
        double y;
        y = Math.floor(x * 100 + 0.5) / 100;
        System.out.println("value of y after rounding to tenths position: "+ y );
        return y;
    }

    public static double roundToHundredths(double x){
        double y;
        y = Math.floor(x * 100 + 0.5) / 1000;
        System.out.println("value of y after rounding to hundredths position: "+ y );
        return y;
    }
    public static double roundToThousandths(double x){
        double y;
        y = Math.floor(x * 100 + 0.5) / 10000;
        System.out.println("value of y after rounding to thousandths position: "+ y );
        return y;
    }


}
