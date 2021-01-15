public class ParkingCharges {
    private static double BASE_PAY = 2.00;
    private static double BASE_TIME= 3.0;
    private static double MAX_PAY = 10.0;
    private double totalParkingCharges = 0;


    double result = 0;

    public double calculateCharges(double hoursParked) {
        if (hoursParked < BASE_TIME) {
            result = BASE_PAY;
        } else {
            result = BASE_PAY + ((hoursParked - BASE_TIME) * 0.5);
            if (result > MAX_PAY) {
                result = MAX_PAY;
            }
        }
        totalParkingCharges += result;
            return result;
    }

    public double getTotalParkingCharges() {
        return totalParkingCharges;
    }

    }


