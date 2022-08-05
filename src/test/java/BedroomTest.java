import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BedroomTest {
    Bedroom bedroom;

    @Before
    public void before() {
        bedroom = new Bedroom(101, RoomType.SINGLE);
    }

    @Test
    public void canGetRoomNumber() {
        assertEquals(101, bedroom.getRoomNumber());
    }

    @Test
    public void canGetRoomType() {
        assertEquals(RoomType.SINGLE, bedroom.getRoomType());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(1, bedroom.getCapacity());
    }

    @Test
    public void canGetGuestCount() {
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canAddGuest() {
        Guest john = new Guest("John");
        bedroom.addGuest(john);
    }

    @Test
    public void canRemoveGuest() {
        Guest john = new Guest("John");
        bedroom.addGuest(john);
        bedroom.removeGuests();
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canCheckIfGuestIsInRoom() {
        Guest john = new Guest("John");
        bedroom.addGuest(john);
        assertTrue(bedroom.isGuestInRoom(john));
    }
}
