package Buoi7;

import java.util.Date;

public class zTesting {
    public static void main(String[] args) {
        //Test HinhHoc

        //Upcasting
        HinhHoc h1=new HinhTron(5);
        HinhHoc h2=new HinhCN(5, 3);
        
        h1.tinhDienTich();
        h2.tinhDienTich();
        //Test cua Animal
        Animal a1 = new Dog();
        Animal a2 = new Pig();

        a1.makeSound();
        a2.makeSound();
        //Test XeDap va DapDien
        XeDap xe1 = new XeDap();
        XeDap xe2 = new XeDapDien();

        xe1.run();
        xe2.run();
        //Test person
        Employee thuky = new Employee();
        thuky.setname("Nguyen Van A");
        thuky.setbirthday(new Date(100,0,15));
        thuky.setsalary(200000000);
        Manager quanly = new Manager();
        quanly.setname("Nguyen Thi B");
        quanly.setbirthday(new Date(100,0,15));
        quanly.setsalary(500000000);
        quanly.setAssistant(thuky);

        System.out.println("Thong tin thu ky "+thuky.getDetails());
        System.out.println("Thong tin quan ly "+quanly.getDetails());
        //Test NganHang
        NganHang nh1 = new SBI();
        NganHang nh2 = new ICIC();
        NganHang nh3 = new AXIS();
        
        nh1.setname("SBI");
        nh2.setname("ICIC");
        nh3.setname("AXIS");
        nh1.ToString();
        nh2.ToString();
        nh3.ToString();
        // Test Car
        Car c1 = new LanRover();
        Car c2 = new Ford();
        Car c3 = new Honda();

        c1.move();
        c2.move();
        c3.move();
    }
}
