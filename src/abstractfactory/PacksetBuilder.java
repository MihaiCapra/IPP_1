package abstractfactory;


public class PacksetBuilder {
    public void buildWindow(AbstractBoxFactory widgetFactory){
        Packset packset = widgetFactory.createBox();
        packset.setTitle("New Box");
    }
}
