package buoi4;

public class Rectangle {
    private int lenght;
    private int width;
    public Rectangle(){
        this.lenght=0;
        this.width=0;
    }
    public Rectangle(int lenght,int width){
        this.lenght=lenght;
        this.width=width;
    }
    public void setlenght(int lenght){
        this.lenght=lenght;
    }
    public void setWidth(int width){
        this.width=width;
    }
    public int getlenght(){
        return lenght;
    }
    public int getWidth(){
        return width;
    }
    public int Area(){
        return lenght*width;
    }
    public String toString(){
        return "Lenght="+this.lenght+"Width="+this.width;
    }
    public void display(){
        System.out.println(this.toString());
        System.out.println("Area:"+Area());
    }
}
