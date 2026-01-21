package buoi4;
public class Circle {
    private double radius;
    private String color;
    public Circle(){
        this.radius=1.0;
        this.color="red";
    }
    public Circle(double radius){
        this.radius=radius;
        this.color="red";
    }
    public Circle(double radius,String color){
        this.radius=radius;
        this.color=color;
    }
    public double getRadius(){
        return radius;
    }
    public String getColor(){
        return color;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public void setColor(String color){
        this.color=color;
    }
    public double Area(){
        return Math.PI*radius*radius;
    }
    public String toString(){
        return "Radius="+this.radius+"Color"+this.color;
    }

    public void display()
    {
        System.err.println(this.toString());
        System.err.println("Area:"+Area());
    }
}