import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Child malish = new Child();
        Karlson karlson = new Karlson();
        Domomuch FrekenBok = new Domomuch();
        Someone someone = new Someone();
        Room kitchen = new Room("Кухня");
        Room malishRoom = new Room("Комната малыша");
        Window window = new Window(kitchen);
        Door door = new Door(malishRoom);

        Cupboard cupboard = new Cupboard(malishRoom);

        iFurniture desk = new iFurniture() {
            String name = "Стол";
            String color = "Желтый";
            Room room = malishRoom;

            @Override
            public void paint(String a) {
                color = a;
            }

            @Override
            public void move(Room a) {
                room = a;
            }

            public String getName() {
                return name;
            }

            public String getColor() {
                return color;
            }

            public Room getRoom() {
                return room;
            }
        };

        Main temp = new Main();
        Chair a = temp.new Chair(malishRoom);

        System.out.println();

        malish.screech();
        FrekenBok.think();
        FrekenBok.runTo(window);
        FrekenBok.lookThroughWindow();
        malish.regret(FrekenBok);
        FrekenBok.lookAt("улицу");
        FrekenBok.goToMiddleOfRoom();
        malish.promise(karlson);
        malish.stole();
        malish.sit();
        malish.openBook();
        malish.hear(FrekenBok.searchInto(cupboard));
        malish.waits();
        FrekenBok.swimOut(cupboard);
        FrekenBok.see(malish);
        FrekenBok.goBack();
        FrekenBok.leanOn(cupboard);
        FrekenBok.stand();
        FrekenBok.sayNothing();
        FrekenBok.lowerEyeLashes();
        FrekenBok.sayNothing();
        FrekenBok.stand();
        FrekenBok.think();
        malish.hear("звук: " + someone.close(door));
        malish.laugh();
        karlson.fly(window);
        karlson.help(FrekenBok);
        FrekenBok.noticeNothing();
        FrekenBok.stand();
        FrekenBok.sayNothing();
        FrekenBok.thinkOf("чем-то");
        FrekenBok.say();
        FrekenBok.pull(door);
        FrekenBok.pile(door);
        System.out.println("Это не помогает.");
        FrekenBok.cry();
        FrekenBok.snort();
        FrekenBok.sit();

        System.out.println(karlson);
        System.out.println(malish);
        System.out.println(FrekenBok);
        System.out.println(kitchen);
        System.out.println(window);
        System.out.println(door);

    }

    public class Chair implements iFurniture{
        String name;
        String color;
        Room room;

        Chair(Room a) {
            name = "стул";
            color = "красный";
            room = a;
        }

        @Override
        public void paint(String a) {
            color = a;
        }

        @Override
        public void move(Room a) {
            room = a;
        }

        public String getName() {
            return name;
        }

        public String getColor() {
            return color;
        }

        public Room getRoom() {
            return room;
        }
    }

    public static class Cupboard implements iThing {
        private State state;
        private String name;
        private Room room;

        Cupboard(Room room) {
            state = State.OPEN;
            name = "Шкаф";
            this.room = room;
        }

        @Override
        public void close() {
            state = State.CLOSED;
        }

        @Override
        public void open() {
            state = State.OPEN;
        }

        @Override
        public String getName() {
            return name;
        }

        public State getState() {
            return state;
        }

        @Override
        public void makeBroken() {
            state = State.BROKEN;
        }

        public Temp getDoors() {
            class CupboardDoors implements Temp{
                String name = "дверцы шкафа";
                Cupboard parent = Cupboard.this;
                Room location = Cupboard.this.room;

                public String getName() {
                    return name;
                }
            }
            return new CupboardDoors();
        }
    }
}
