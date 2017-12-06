package builder;


public class PostMan {
    private PacksetBuilder packsetBuilder;

    public void setPacksetBuilder(PacksetBuilder pb) { packsetBuilder = pb; }
    public Package getPackset() { return packsetBuilder.getaPackage(); }

    public void packageObject() {
        packsetBuilder.buildSize();
        packsetBuilder.buildType();
    }
}
