package Buoi7;

public class NganHang {
    public String name;
    public void setname(String name)
    {
        this.name = name;
    }
    public double LaiSuat()
    {
        return 0;
    }
    public void ToString(){
        System.out.println("Name "+this.name+" Lai suat "+this.LaiSuat());
    }
}
class SBI extends NganHang{
    @Override
    public double LaiSuat(){
        return 0.08;
    }
}
class  ICIC extends NganHang{
    @Override
    public double LaiSuat(){
        return 0.07;
    }
}
class AXIS extends NganHang{
    @Override
    public double LaiSuat(){
        return 0.09;
    }
}