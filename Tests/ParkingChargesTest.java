import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingChargesTest {
    ParkingCharges parkingCharges;

    @BeforeEach
    void setUp() {
        parkingCharges = new ParkingCharges();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatParkingChargeCanBeCalculatedForOneVehicle(){
        //when
       double result=  parkingCharges.calculateCharges(24);
        //assert
        assertEquals(10.0, result);

        result=  parkingCharges.calculateCharges(2);
        //assert
        assertEquals(2.0, result);

        result=  parkingCharges.calculateCharges(3);
        //assert
        assertEquals(2.0, result);

        result=  parkingCharges.calculateCharges(5);
        //assert
        assertEquals(3, result);

    }


    @Test
    void testThatParkingChargesCalculatedForTotalVehicles(){
        //when
        parkingCharges.calculateCharges(24);
        parkingCharges.calculateCharges(2);
        parkingCharges.calculateCharges(3);
        parkingCharges.calculateCharges(5);

        double total = parkingCharges.getTotalParkingCharges();
        //assert
        System.out.println(total);
    }


}

