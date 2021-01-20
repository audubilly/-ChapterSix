public class EvenAndOddNumbers {

    public static void main(String[] args) {
        System.out.println(isEvenNumber(253));
//        System.out.println(isOddNumber(34));

    }

    public static boolean isEvenNumber(int i) {
        boolean result;
        if(i % 2 == 0){
            result = true;
        }else
        result = false;

        return result;
    }


//    public static boolean isOddNumber(int i) {
//        boolean result;
//        if(i % 2 != 0){
//           result = true;
//        }else
//            result = false;
//
//        return result;
//
//    }
}
