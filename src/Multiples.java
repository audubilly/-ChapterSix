public class Multiples {
    public static void main(String[] args) {
        System.out.println(isMultiples(3,5));
    }


    public static boolean isMultiples(int x, int y) {
        boolean result;
        if(y % x == 0){
            result = true;
        }else
            result = false;
        return  result;
    }
}
