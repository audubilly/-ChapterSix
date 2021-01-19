public class HypotenuseCalculations {

    public static void main(String[] args) {
        System.out.printf("the value of the hypotenuse of triangle 1 is: %.2f %n", calculateHypotenuse(3.0,4.0));
        System.out.printf("the value of the hypotenuse of triangle 2 is: %.2f %n", calculateHypotenuse(5.0,12.0));
        System.out.printf("the value of the hypotenuse of triangle 3 is: %.2f %n", calculateHypotenuse(8.0,15.0));
    }


    public static double calculateHypotenuse(double side1, double side2) {
        double hypotenuse = Math.sqrt((Math.pow(side1,2) + Math.pow(side2,2)));
//        System.out.printf("the value of the hypotenuse of triangle 1 is:%.2f " , hypotenuse);
        return Double.parseDouble(String.format("%.2f", hypotenuse));
    }
}
