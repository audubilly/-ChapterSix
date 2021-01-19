import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SphereVolumeTest {




    @BeforeEach
    void setUp() {

        SphereVolume sphereVolume = new SphereVolume();
    }


    @AfterEach
    void tearDown() {
    }


    @Test
    void testThatAppCanCalculateSphereVolume() {
//  when
     double result= SphereVolume.calculateSphereVolume();
//     assert
//       System.out.println(result);
        assertEquals(33.51, result);

    }

}