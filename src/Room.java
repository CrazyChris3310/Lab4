import java.util.Objects;

public class Room {
    private String place;

    Room(String rm) {
        place = rm;
        System.out.println("Создана комана " + place);
    }
    public String getRoom() {
        return place;
    }

    @Override
    public String toString() {
        return "\nКласс Room" +
                "\nНазвание: " + place;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return place.equals(room.place);
    }

    @Override
    public int hashCode() {
        return Objects.hash(place);
    }
}