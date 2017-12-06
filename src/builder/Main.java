package builder;

public class Main {
    public static void main(String[] args) {
        PostMan postMan = new PostMan();
        PacksetBuilder letterBuilder = new LetterBuilder();
        PacksetBuilder boxBuilder = new BoxBuilder();

        postMan.setPacksetBuilder( letterBuilder );
        postMan.packageObject();

        Package aPackage = postMan.getPackset();
    }
}
