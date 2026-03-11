package Buoi8;
public abstract class Bike {
    abstract void brake();
}
class SportBike extends Bike {
    @Override
    public void brake(){
        System.out.println("SportBike break");
    }
}
class MountainBike extends Bike {
    @Override
    public void brake(){
        System.out.println("MountainBike break");
    }
}

