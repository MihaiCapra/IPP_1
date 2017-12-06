package factorymethod;

public class Size {
    private double mWidth;
    private double mLength;
    private double mHeight;

    public Size(double mWidth, double mLength, double mHeight) {
        this.mWidth = mWidth;
        this.mLength = mLength;
        this.mHeight = mHeight;
    }

    public double getmWidth() {
        return mWidth;
    }

    public void setmWidth(double mWidth) {
        this.mWidth = mWidth;
    }

    public double getmLength() {
        return mLength;
    }

    public void setmLength(double mLength) {
        this.mLength = mLength;
    }

    public double getmHeight() {
        return mHeight;
    }

    public void setmHeight(double mHeight) {
        this.mHeight = mHeight;
    }

    @Override
    public String toString() {
        return "[" + mWidth +
                "x" + mLength +
                "x" + mHeight +
                ']';
    }
}
