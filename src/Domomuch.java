public class Domomuch extends Human {
    Domomuch() {
        super("Фрекен Бок", "Домомучительница", "средний", "готовить");
        setMood(Mood.GRUMPY);
    }

    public void sayNothing() {
        System.out.println(getName() + " ничего не говорит.");
    }

    public void stand() {
        System.out.println(getName() + " стоит.");
    }

    public void torture(Human a) {
        System.out.println(getName() + " мучает " + a.getNickname() + "а" + ".");
    }

    @Override
    public String defineMood() {
        switch ((int)(Math.round(Math.random()) * 2)) {
            case 0:
                return " молча ";
            case 1:
                return " крутит головой и ";
            case 2:
                return " ворчит и ";
            default:
                return " ";
        }
    }

    public void think() {
        System.out.println(getName() +defineMood() + "думает.");
    }

    @Override
    public String toString() {
        return "\nКласс Domomuch" + super.toString();
    }

    public void runTo(iThing a) {
        System.out.println(getName() + " подбегает к объекту: " + a.getName());
    }

    public void lookAt(String a) {
        System.out.println(getName() + "смотрит на " + a);
    }

    public void lookThroughWindow() {
        System.out.println(getName() + " высовываеся в окно.");
    }

    public void goToMiddleOfRoom() {
        System.out.println(getName() + "отошла в глубь комнаты");
    }

    public void searchInto(Main.Cupboard c) {
        System.out.println(getName() + "обшаривает" + c.getName());
    }

    public void turnAround() {
        System.out.println(getName() + "оборачивается.");
    }

    public void swimOut(Main.Cupboard a) {
        System.out.println(getName() + " вылазит из шкафа.");
    }

    public void see(Human h) {
        System.out.println(getName() + " видит персонажа: " + h.getName());
    }

    public void goBack() {
        System.out.println(getName() + " пятится назад.");
    }

    private void checkCupboard(Main.Cupboard c) {
        if (c.getState() == State.OPEN)
            throw new CupboardLockedException();
    }

    public void leanOn(Main.Cupboard a) {
        try {
            checkCupboard(a);
            System.out.println(getName() + "прислоняется к объекту " + a.getDoors().getName());
        } catch (CupboardLockedException e) {
            System.out.println(getName() + " пытается прислониться к шкафу, но дверцы шкафа открыты.");
            System.out.println(getName() + " проваливается в шкаф.");
            swimOut(a);
        }
    }

    public void lowerEyeLashes() {
        System.out.println(getName() + " опускает веки.");
    }

    public void noticeNothing() {
        System.out.println(getName() + " ничего не замечает.");
    }

    public void thinkOf(String a) {
        System.out.println(getName() + " думает о " + a);
    }

    public void pile(Door a){
        System.out.println(getName() + " наваливаеться на " + a.getName() + ".");
    }
    public void cry(){
        System.out.println(getName() + " ревет.");
    }
    public void snort(){
        System.out.println(getName() + " фырчит от возмущения.");
    }
    public void sit(){
        System.out.println(getName() + "саиться на стул.");
    }

    private void checkDoor(Door d) throws DoorLockedException {
        if (d.getState() == State.CLOSED)
            throw new DoorLockedException();
    }

    public void pull(Door d) {
        try {
            checkDoor(d);
            System.out.println("Она хватается за ручку и открывает дверь");
        } catch (DoorLockedException e) {
            System.out.println("Она хватается за ручку, нажимает раз, другой, третий. Но дверь не открывается.");
        }
    }
}
