public interface Person {
    String getName();
    String getNickname();
    String getAge();
    void hear(String a);
    void say();
    void say(String a);
    Mood getMood();
    void setMood(Mood a);
    String defineMood();
    String getLoveObj();
    void love();
}
