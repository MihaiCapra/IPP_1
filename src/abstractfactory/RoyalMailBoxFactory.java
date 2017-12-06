package abstractfactory;


public class RoyalMailBoxFactory implements AbstractBoxFactory {
    //create an RoyalMail Box
    public Packset createBox(){
        RoyalMailPackset box = new RoyalMailPackset();
        return box;
    }
}
