package builder;


public class LetterBuilder extends PacksetBuilder {

    @Override
    public void buildType() {
        aPackage.setType("letter");
    }

    @Override
    public void buildSize() {
        aPackage.setSize("regular");
    }
}
