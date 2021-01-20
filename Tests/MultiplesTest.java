import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultiplesTest {

    Multiples multiples;
    @BeforeEach
    void setUp() {
        multiples = new Multiples();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void appCanCheckForIsMultiples(){
//        when
         boolean result = multiples.isMultiples(3,6);
//         assert
        assertTrue(result);
    }
}