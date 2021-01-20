import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenAndOddNumbersTest {
    EvenAndOddNumbers evenAndOddNumbers;
    @BeforeEach
    void setUp() {
        evenAndOddNumbers = new EvenAndOddNumbers();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatAppCanGetEvenNumber(){
//        when
        boolean result = evenAndOddNumbers.isEvenNumber(2);
//        assert
        assertTrue(result);
//
    }

//    @Test
//     void testThatAppCanGetOddNumber(){
////        when
//       boolean result= evenAndOddNumbers.isOddNumber(3);
////       assert
//       assertTrue(result);
//   }


}