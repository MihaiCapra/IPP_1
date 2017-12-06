package builder;

abstract class PacksetBuilder {
    Package aPackage;

    public Package getaPackage() { return aPackage; }
    public void createNewPackage() { aPackage = new Package(); }

    public abstract void buildType();
    public abstract void buildSize();
}
