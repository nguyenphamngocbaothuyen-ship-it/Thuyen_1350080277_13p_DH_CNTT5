package Buoi7;

public class Car {
    public void move (){
        System.out.println("Car dang di chuyen");
    }
}
class LanRover extends Car{
    @Override
    public void move(){
        System.out.println("LanRover di chuyen binh thuong");
    }
}
class Ford extends Car{
    @Override
    public void move(){
        System.out.println("Ford di chuyen nhan");
    }
}
class Honda extends Car{
    @Override
    public void move(){
        System.out.println("Honda di chuyen muot");
    }
}