package prototype;

public class Box implements Cloneable{
    private String color;

    Box(String col){
        setColor(col);
    }

    public Box clone(){
        Box b=null;
        try{
            b=(Box)super.clone();
        }catch(Exception e){
            e.printStackTrace();
        }
        return b;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }
}