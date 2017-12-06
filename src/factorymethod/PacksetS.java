package factorymethod;

public class PacksetS implements Packset {
    @Override
    public String getType() {
        return "Packset S";
    }

    @Override
    public Size getSize() {
        return new Size(25, 17.5, 10);
    }

    @Override
    public String getPrice() {
        return "EUR 1.69";
    }

    @Override
    public String toString() {
        return "[" + getType() +
                " |" + getSize().toString() +
                "| " + getPrice() +
                "]";
    }
}
