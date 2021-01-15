import java.util.Scanner;

public class ParkingChargesMain {

    public static void main(String[] args) {
        //double hoursParked;

        ParkingCharges parkingCharges = new ParkingCharges();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Hours Parked or -1 to quit: ");
        int hoursParked = input.nextInt();

        double result;
        while (hoursParked != -1) {

            result = parkingCharges.calculateCharges(hoursParked);
            System.out.println("Parking Charge For Current Customer is :$" + result);

            System.out.println("Enter Hours Parked or -1 to quit: ");
            hoursParked = input.nextInt();

        }

        result = parkingCharges.getTotalParkingCharges();
        System.out.println("Running Total of yesterdays receipts is :$" + result);
    }
}