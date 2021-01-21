import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    TemperatureConversions temperatureConversions;
    @BeforeEach
    void setUp() {

        temperatureConversions = new TemperatureConversions();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatAppCanReturnCelsiusEquivalentOfFahrenheit(){
//        when
        int result = temperatureConversions.celsius();
//        assert
        assertEquals(-5,result );
    }

    @Test
    void testThatAppCanReturnFahrenheitEquivalentOfCelsius(){
//        when
        int result = temperatureConversions.fahrenheit();
//        assert
        assertEquals(73, result);
    }

}