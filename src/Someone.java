
public class Someone extends Human {
    Someone() {
        super("Кто-то", "Кто-то", "неизвестно", "что-то");
    }

    @Override
    public String defineMood() {
        switch ((int)(Math.round(Math.random() * 2))) {
            case 0:
                return " как-то ";
            case 1:
                return " зачем-то ";
            case 2:
                return " бесшумно ";
            default:
                return " ";
        }
    }

    public String close(iThing a) {
        a.close();
        return getName() + defineMood() + "закрывает " + a.getName() + ".";
    }

    @Override
    public String toString() {
        return "\nКлас Someone" + super.toString();
    }
}
