package Buoi8;
import java.util.Scanner;

public abstract class HinhHoc {
    public final float PI= 3.14f;
    public String ten;
    public  float Chuvi;
    public  float Dientich;
    public  float TheTich;
    public HinhHoc(){}
    public void xuatTen(){
        System.out.print("Ten Hinh "+ten);
    }
    abstract void inChuVi();
    abstract void inDientich();
    public void inThetich(){
        System.out.println("The Tich "+TheTich);
    }
}
class HinhTron extends HinhHoc{
    public float BanKinh;
    public HinhTron(){
        ten="Hinh Tron";
    }
    public void nhapBanKinh(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap Ban Kinh: ");
        BanKinh = sc.nextFloat();
    }
    @Override
    public void inChuVi(){
        Chuvi=2*PI*BanKinh;
        System.out.println("Chu vi hinh "+ten+" la "+Chuvi);
    }
    public void inDientich(){
        Dientich=PI*BanKinh*BanKinh;
        System.out.println("Dien tich hinh "+ten+" la "+Dientich);
    }
}
class HinhCN extends HinhHoc{
    public float cd;
    public float cr;
    public HinhCN(){
        ten="Hinh CN";
    }
    public void nhapcd(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        cd = sc.nextFloat();
    }
    public void nhapcr(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        cr = sc.nextFloat();
    }
    @Override
    public void inChuVi(){
        Chuvi=(cd+cr)*2;
        System.out.println("Chu vi hinh "+ten+" la "+Chuvi);
    }
    public void inDientich(){
        Dientich=cd*cr;
        System.out.println("Dien tich hinh "+ten+" la "+Dientich);
    }
}
class HinhTru extends HinhTron{
    public float Chieucao;
    public HinhTru(){
        ten="Hinh tru";
    }
    public void nhapChieucao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu ca0: ");
        Chieucao = sc.nextFloat();
    }
    public void tinhTheTich(){
        TheTich=PI*BanKinh*BanKinh*Chieucao;
        System.out.println("The tich hinh "+ten+" la "+TheTich);
    }
}
class HinhVuong extends HinhCN{
    public HinhVuong(){
        ten="Hinh Vuong";
    }
    public void nhapCanh(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Nhap canh: ");
        cd=cr=sc.nextFloat();
    }
}
