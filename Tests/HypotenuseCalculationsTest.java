import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HypotenuseCalculationsTest {


    @BeforeEach
    void setUp() {
        HypotenuseCalculations hypotenuseCalculations = new HypotenuseCalculations();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testThatAppCanCalculateHypotenuse(){
        //when
        double result = HypotenuseCalculations.calculateHypotenuse(2.0,2.0);
        //assert
        assertEquals(2.83, result);
    }

}