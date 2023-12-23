import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FleetTest {


    @Test
    void ToStringLocation(){
        Location l = new Location(4, 5);
        assertEquals("D-6", l.toString());
    }



    @Test
    void isNotHit(){
        Location firstLocation = new Location(4, 5);
        Location secountLocation = new Location(4, 6);
        ShipLocation shipLocation = new ShipLocation("battle");
        shipLocation.hit(firstLocation);
        shipLocation.hit(secountLocation);
        Fleet fleet = new Fleet();
        fleet.place("battle", shipLocation);
        assertFalse(fleet.isHit(new Location(1, 9)));


    }
    @Test
    void isHit(){
        Location firstLocation = new Location(4, 5);
        Location secountLocation = new Location(4, 6);
        ShipLocation shipLocation = new ShipLocation("battle");
        shipLocation.hit(firstLocation);
        shipLocation.hit(secountLocation);
        Fleet fleet = new Fleet();
        fleet.place("battle", shipLocation);
        assertTrue(fleet.isHit(firstLocation));

    }


    @Test
    void equale(){
        Location firstLocation = new Location(4, 5);
        Location secountLocation = new Location(4, 5);
        assertTrue(firstLocation.equals(secountLocation));


    }


}