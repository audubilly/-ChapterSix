import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumTest {

    FindMinimum findMinimum;

    @BeforeEach
    void setUp() {
        findMinimum = new FindMinimum();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatAppCanFindMinimumNumber(){
//        when
        float result = findMinimum.minimum3();
//        assert
        assertEquals(12.0, result);
    }
}