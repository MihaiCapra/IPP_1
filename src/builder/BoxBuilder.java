package builder;


public class BoxBuilder extends PacksetBuilder {
    @Override
    public void buildType() {
        aPackage.setType("box");
    }

    @Override
    public void buildSize() {
        aPackage.setSize("XS");
    }
}
