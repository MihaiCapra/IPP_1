package factorymethod;

public class PacksetF implements Packset {
    @Override
    public String getType() {
        return "Packset F";
    }

    @Override
    public Size getSize() {
        return new Size(  38, 12, 12 );
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
