import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    Hotel hotel;
    Bedroom singleRoom;
    Bedroom doubleRoom;
    ConferenceRoom conferenceRoom;
    Guest john;
    Guest jarrod;

    @Before
    public void before() {
        hotel = new Hotel();
        singleRoom = new Bedroom(101, RoomType.SINGLE);
        doubleRoom = new Bedroom(202, RoomType.DOUBLE);
        conferenceRoom = new ConferenceRoom(50, "Za Confer");
        john = new Guest("John");
        jarrod = new Guest("Jarrod");
    }

    @Test
    public void canGetBedroomCount() {
        assertEquals(0, hotel.bedroomCount());
    }

    @Test
    public void canAddBedroomToHotel() {
        hotel.addRoom(singleRoom);
        assertEquals(1, hotel.bedroomCount());
    }

    @Test
    public void canCheckGuestInToBedroom() {
        hotel.addRoom(singleRoom);
        hotel.checkIn(john, RoomType.SINGLE);
        assertEquals(1, singleRoom.guestCount());
    }

    @Test
    public void canCheckGuestOutOfBedroom() {
        hotel.addRoom((singleRoom));
        hotel.checkIn(john, RoomType.SINGLE);
        hotel.checkOut(john);
        assertEquals(0, singleRoom.guestCount());
    }

    @Test
    public void canGetConferenceRoomCount() {
        assertEquals(0, hotel.conferenceRoomCount());
    }

    @Test
    public void canAddConferenceRoom() {
        hotel.addRoom(conferenceRoom);
        assertEquals(1, hotel.conferenceRoomCount());
    }

    @Test
    public void canCheckGuestInToConferenceRoom() {
        hotel.addRoom(conferenceRoom);
        hotel.checkIn(john, conferenceRoom);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canCheckGuestOutOfConferenceRoom() {
        hotel.addRoom(conferenceRoom);
        hotel.checkIn(john, conferenceRoom);
        hotel.checkOut(john);
        assertEquals(0, conferenceRoom.guestCount());
    }
}
