import javax.swing.*;

public class FindMinimum {

    public static void main(String[] args) {
        System.out.printf( "the Minimum Of The 3 Numbers is : %.3f" , minimum3());
    }

    public static float minimum3() {
        String input = JOptionPane.showInputDialog(null, "Please Enter Number: ");
        float number1 = Float.parseFloat(input);

         input = JOptionPane.showInputDialog(null, "Please Enter Number: ");
        float number2 = Float.parseFloat(input);


        input = JOptionPane.showInputDialog(null, "Please Enter Number: ");
        float number3 = Float.parseFloat(input);


       return Math.min(number1, Math.min( number2, number3));
    }
}
