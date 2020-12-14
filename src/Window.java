import java.util.Objects;

public class Window implements iThing {
    private String obj;
    private Room room;
    private State state;

    Window(Room a){
        obj = "Окно";
        room = a;
        state = State.OPEN;
        System.out.println("Создано " + obj + " в комнате: " + room.getRoom());
    }

    @Override
    public void makeBroken() {
        state = State.BROKEN;
    }

    @Override
    public String getName() {
        return obj;
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
        return "\nКласс Window" +
                "\nНазвание: " + obj +
                "\nРасположение: " + room.getRoom() +
                "\nСостояние: " + state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Window window = (Window) o;
        return Objects.equals(obj, window.obj) &&
                Objects.equals(room, window.room) &&
                state == window.state;
    }

    @Override
    public int hashCode() {
        return Objects.hash(obj, room, state);
    }
}