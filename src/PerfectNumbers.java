import javax.swing.*;

public class PerfectNumbers {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if(isPerfect(i)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPerfect(int number) {
        int sum = 0;
        boolean result;
//
//        String input = JOptionPane.showInputDialog(null, "Please Enter number: ");
//        int number = Integer.parseInt(input);

        for(int i= 1; i < number; i++){
            if(number % i == 0){
                sum = sum + i;
            }
        }
        if(sum == number){
            //System.out.printf("%d is a perfect Number", number);
            return true;
        }else
            //System.out.printf("%d is not a perfect Number", number);
//        return true;
        return false;
    }
}
