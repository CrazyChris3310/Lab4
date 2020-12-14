import java.util.Objects;

abstract public class Human implements Person {
    private String name;
    private String age;
    private String nickname;
    private Mood mood;
    private String loveObj;

    Human(String name, String nickname, String age, String loveObj) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
        this.loveObj = loveObj;
        System.out.println("В квартиру добавлен " + name + " по кличке " + nickname + ".");
    }

    public String getName() {
        return name;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAge() {
        return age;
    }

    public void walk() {
        System.out.println(name + " ходит...");
    }

    public void hear(String a) {
        System.out.println(name + " слышит " + a + '.');
    }

    public void say(String a) {
        System.out.println(name + " говорит: \"" + a + "\".");
    }

    public void say() {
        System.out.println(name + " говорит.");
    }

    public Mood getMood() {
        return mood;
    }

    public void setMood(Mood mood) {
        this.mood = mood;
    }

    public String getLoveObj() {
        return loveObj;
    }

    public void love() {
        System.out.println(getName() + " любит " + getLoveObj());
    }

    @Override
    public String toString() {
        return "\nИмя: " + getName() +
                "\nКличка: " + getNickname() +
                "\nВозраст: " + getAge() +
                "\nНастроение: " + getMood() +
                "\nЛюбит: " + getLoveObj();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) &&
                Objects.equals(age, human.age) &&
                Objects.equals(nickname, human.nickname) &&
                mood == human.mood &&
                Objects.equals(loveObj, human.loveObj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, nickname, mood, loveObj);
    }
}
