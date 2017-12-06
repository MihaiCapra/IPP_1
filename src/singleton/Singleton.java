package singleton;

public class Singleton {
    private static Singleton mInstance;

    private Singleton(){
        System.out.println("DHL");
    }

    public static Singleton getInstance() {
        if(mInstance == null){
            mInstance = new Singleton();
        }
        return mInstance;
    }
}
