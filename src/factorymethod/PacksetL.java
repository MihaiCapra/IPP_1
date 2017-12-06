package factorymethod;

public class PacksetL implements Packset {
    @Override
    public String getType() {
        return "Packset L";
    }

    @Override
    public Size getSize() {
        return new Size(  45, 35,20);
    }

    @Override
    public String getPrice() {
        return "EUR 2.49";
    }

    @Override
    public String toString() {
        return "[" + getType() +
                " |" + getSize().toString() +
                "| " + getPrice() +
                "]";
    }
}
