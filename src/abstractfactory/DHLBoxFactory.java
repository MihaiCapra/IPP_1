package abstractfactory;


public class DHLBoxFactory implements AbstractBoxFactory {
    //create a MacOSXWindow
    public Packset createBox(){
        DHLPackset box = new DHLPackset();
        return box;
    }
}
