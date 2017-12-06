package abstractfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        PacksetBuilder builder = new PacksetBuilder();
        Scanner in = new Scanner(System.in);
        String boxMail = in.nextLine();
        AbstractBoxFactory widgetFactory;

        if(boxMail.contains("dhl")){
            widgetFactory  = new DHLBoxFactory();
        } else {
            widgetFactory  = new RoyalMailBoxFactory();
        }
        builder.buildWindow(widgetFactory);
    }
}
