import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {
    ConferenceRoom conferenceRoom;

    @Before
    public void before() {
        conferenceRoom = new ConferenceRoom(25, "The Conference Room");
    }

    @Test
    public void canGetRoomName() {
        assertEquals("The Conference Room", conferenceRoom.getName());
    }

    @Test
    public void canGetCapacity() {
        assertEquals(25, conferenceRoom.getCapacity());
    }

    @Test
    public void canGetGuestCount() {
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canAddGuest() {
        Guest john = new Guest("John");
        conferenceRoom.addGuest(john);
    }

    @Test
    public void canRemoveGuest() {
        Guest john = new Guest("John");
        conferenceRoom.addGuest(john);
        conferenceRoom.removeGuests();
        assertEquals(0, conferenceRoom.guestCount());
    }
}
