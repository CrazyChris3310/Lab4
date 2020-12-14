public class Child extends Human {
    Child() {
        super("Малыш", "Малыш", "юный", "плюшки с корицей");
        setMood(Mood.HAPPY);
    }

    public void hear(String a) {
        System.out.println(getName() + " слышит: " + a + '.');
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

    public void regret(Human a){
        System.out.println(getName() + " жалеет персонажа " + a.getNickname() + ".");
    }
    public void screech(){
        System.out.println(getName() + " завизжал от смеха.");
    }
    public void promise(Human a){
        System.out.println(getName() + " обещает помогать персонажу "+ a.getNickname() + ".");
    }
    public void stole(){
        System.out.println(getName() + " потихоньку подкрадываеться к столу.");
    }
    public void sit(){
        System.out.println(getName() + " садиться на стул");
    }
    public void openBook(){
        System.out.println(getName() + " открывает задачник.");
    }
    public void waits(){
        System.out.println(getName() + " ждёт когда обернеться ФрекенБок с огромным напряжением.");
    }

    @Override
    public String toString() {
        return "\nКласс Child" + super.toString();
    }
}
