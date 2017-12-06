package factorymethod;

public class PacksetXS implements Packset {
    @Override
    public String getType() {
        return "Packset XS";
    }

    @Override
    public Size getSize() {
        return new Size(22.5, 14.5, 3.5);
    }

    @Override
    public String getPrice() {
        return "EUR 1.49";
    }

    @Override
    public String toString() {
        return "[" + getType() +
                " |" + getSize().toString() +
                "| " + getPrice() +
                "]";
    }
}
