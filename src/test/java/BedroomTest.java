import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
