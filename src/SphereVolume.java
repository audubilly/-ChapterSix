import javax.swing.*;
import java.util.Scanner;

public class SphereVolume {

    public static void main(String[] args) {
        calculateSphereVolume();
    }


    public static double calculateSphereVolume() {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter radius");
//        double radius =  input.nextDouble();

        String input = JOptionPane.showInputDialog(null, "Please Enter radius: ");
        double radius = Double.parseDouble(input);

        double volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
       System.out.printf("the volume is: %.2f", volume);
        return Double.parseDouble(String.format("%.2f", volume));

//        return  volume;

    }
}

