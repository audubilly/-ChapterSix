import javax.swing.*;

public class TemperatureConversions {


    public static void main(String[] args) {
        System.out.printf("the Temperature in celsius: %d%n", celsius());
        System.out.printf("the Temperature in fahrenheit: %d", fahrenheit());
    }
    public static  int celsius() {

        String input = JOptionPane.showInputDialog(null, "Please Enter temperature in fahrenheit: ");
        int fahrenheit = Integer.parseInt(input);
        int celsius = (int) (5.0 / 9.0 * (fahrenheit - 32));
        return celsius;

    }


    public static int fahrenheit() {

        String input = JOptionPane.showInputDialog(null, "Please Enter temperature in celsius: ");
        int celsius = Integer.parseInt(input);
        int fahrenheit = (int) (9.0 / 5.0 * celsius + 32);
        return fahrenheit;

    }
}
