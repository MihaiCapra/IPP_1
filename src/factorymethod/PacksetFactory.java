package factorymethod;

class PacksetFactory {
    static Packset createPacket(String type) {
        if (type.equalsIgnoreCase("xs")) {
            return new PacksetXS();
        } else if (type.equalsIgnoreCase("s")) {
            return new PacksetS();
        } else if (type.equalsIgnoreCase("m")) {
            return new PacksetM();
        } else if (type.equalsIgnoreCase("l")) {
            return new PacksetL();
        } else if (type.equalsIgnoreCase("f")) {
            return new PacksetF();
        }
        throw new IllegalArgumentException("No such Packset");
    }
}
