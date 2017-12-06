package factorymethod;

public class PacksetM implements Packset {
    @Override
    public String getType() {
        return "Packset M";
    }

    @Override
    public Size getSize() {
        return new Size( 37.5 , 30 , 13.5);
    }

    @Override
    public String getPrice() {
        return "EUR 1.99";
    }

    @Override
    public String toString() {
        return "[" + getType() +
                " |" + getSize().toString() +
                "| " + getPrice() +
                "]";
    }
}
