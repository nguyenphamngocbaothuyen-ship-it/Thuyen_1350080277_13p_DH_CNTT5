package Buoi8;

public abstract class Shape {
    abstract void draw();
    String getColor(){
        return "Red";
    }
}
class Rectangle extends Shape {
    @Override
    public void draw(){
        System.out.println("Draw Rectangle have "+getColor());
    }
}
class Circle extends Shape {
    @Override
    public void draw(){
        System.out.println("Draw Circle have "+getColor());
    }
}
class Triangle extends Shape {
    @Override
    public void draw(){
        System.out.println("Draw Triangle have "+getColor());
    }
}
class Line extends Shape {
    @Override
    public void draw(){
        System.out.println("Draw Line have "+getColor());
    }
}