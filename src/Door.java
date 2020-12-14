import java.util.Objects;

public class Door implements iThing {
    private String obj;
    private Room room;
    private State state;

    Door(Room a) {
        obj = "Дверь";
        room = a;
        state = State.OPEN;
        System.out.println("Создана " + obj + " в комнате: " + room.getRoom());
    }

    public State getState() {
        return state;
    }

    @Override
    public void open() {
        state = State.OPEN;
    }

    @Override
    public void close() {
        state = State.CLOSED;
    }

    @Override
    public String toString() {
        return "\nКласс door" +
                "\nНазвание: " + obj +
                "\nРасположение: " + room.getRoom() +
                "\nСостояние: " + state;
    }

    @Override
    public String getName() {
        return obj;
    }

    @Override
    public void makeBroken() {
        state = State.BROKEN;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Door door = (Door) o;
        return Objects.equals(obj, door.obj) &&
                Objects.equals(room, door.room) &&
                state == door.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(obj, room, state);
    }
}