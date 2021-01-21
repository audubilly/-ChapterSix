import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {

    PerfectNumbers perfectNumbers;

    @BeforeEach
    void setUp() {

        perfectNumbers = new PerfectNumbers();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatAppCanGetPerfectNumber(){
//        when
        boolean result = perfectNumbers.isPerfect(6);
//        assert
        assertTrue(result);
    }
}