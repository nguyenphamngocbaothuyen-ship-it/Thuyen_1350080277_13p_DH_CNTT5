package Buoi8;

public class Main {
    public static void main(String[] args) {
        //Bike
        MountainBike m1 = new MountainBike();
        m1.brake();
        //Shape
        Circle c1 = new Circle();
        Triangle t1 = new Triangle();
        c1.draw();
        t1.draw();
        //HinhHoc
        HinhCN h1 =new HinhCN();
        HinhVuong h2=new HinhVuong();
        HinhTru h3=new HinhTru();
        h1.nhapcd();
        h1.nhapcr();
        h1.inChuVi();
        h1.inDientich();
        h2.nhapCanh();
        h3.nhapBanKinh();
        h3.nhapChieucao();
        h3.tinhTheTich();
        //Person
        Emloyee e=new Emloyee("Thuyen", "HCM", 1000000);
        Customer c=new Customer("Trang", "HN", 200000000);
        e.display();
        System.out.println("----------------");
        c.display();
    }
}
