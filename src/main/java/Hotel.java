import java.util.ArrayList;

public class Hotel {
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;

    public Hotel() {
        this.bedrooms = new ArrayList<>();
        this.conferenceRooms = new ArrayList<>();
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public void addRoom(Bedroom newBedroom) {
        this.bedrooms.add(newBedroom);
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void addRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void checkIn(Guest guest, RoomType roomType) {
          for (Bedroom bedroom : bedrooms) {
              if (bedroom.getRoomType() == roomType) {
                  bedroom.addGuest(guest);
                  return;
              }
          }
    }

    public void checkIn(Guest guest, ConferenceRoom confRoom) {
        if (conferenceRooms.contains(confRoom)) {
            confRoom.addGuest(guest);
        }
    }

    public void checkOut(Guest guest) {
        for (Bedroom bedroom : bedrooms) {
            if (bedroom.isGuestInRoom(guest));
            bedroom.removeGuests();
        }
        for (ConferenceRoom conferenceRoom : conferenceRooms) {
            if (conferenceRoom.isGuestInRoom(guest)) {
                conferenceRoom.removeGuests();
            }
        }
    }
}
