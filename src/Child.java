public class Child extends Human {
    Child() {
        super("Малыш", "Малыш", "юный", "плюшки с корицей");
        setMood(Mood.HAPPY);
    }

    public void hear(String a) {
        System.out.println(getName() + " слышит " + a + '.');
    }

    @Override
    public String defineMood() {
        switch ((int)(Math.round(Math.random()) * 2)) {
            case 0:
                return " тихо ";
            case 1:
                return " нейтрально ";
            case 2:
                return " громко ";
            default:
                return " ";
        }
    }

    public void laugh() {
        System.out.println(getName() + defineMood() + "смеётся.");
    }

    @Override
    public String toString() {
        return "\nКласс Child" + super.toString();
    }
}
