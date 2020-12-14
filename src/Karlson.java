public class Karlson extends Human {
    Karlson() {
        super("Карлсон", "Укротитель домомучительниц",
                "мужчина в самом расцвете сил", "варенье");
        setMood(Mood.KIND);
    }

    public void fly(iThing a) {
        a.makeBroken();
        System.out.println(getNickname() + " влетает в квартиру через " + a.getName() + ".");
    }


    public void help(Human a) {
        System.out.println(getName() + defineMood() + "помогает персонажу " + a.getName() + " всё понять.");
    }

    @Override
    public String defineMood() {
        switch ((int)(Math.round(Math.random()) * 2)) {
            case 0:
                return " лениво ";
            case 1:
                return " охотно ";
            case 2:
                return ", желая пошутить, ";
            default:
                return " ";
        }
    }

    @Override
    public String toString() {
        return "\nКласс Karlson" + super.toString();
    }
}
