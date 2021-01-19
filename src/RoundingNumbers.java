import java.util.Scanner;

public class RoundingNumbers {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("please Enter value of x: ");
       double x = input.nextDouble();
        System.out.println("value of y before rounding: " + x);

        double y;
        y = Math.floor(x + 0.5);
        System.out.println("value of y after rounding: " +  y );
    }

}
