package Buoi7;

public class HinhHoc {
    public void tinhDienTich(){
        System.out.println("Tinh DT cho 1 hinh hoc...");
    }
}
class HinhTron extends HinhHoc{
    private double banKinh;
    public HinhTron(double banKinh){
        this.banKinh=banKinh;
    }
    @Override
    public void tinhDienTich(){
        double DienTich=Math.PI*banKinh*banKinh;
        System.out.println("Dien tich Hinh Tron "+DienTich);
    }
}
class HinhCN extends HinhHoc{
    private double cd;
    private double cr;
    public HinhCN(double cd,double cr){
        this.cd=cd;
        this.cr=cr;
    }
    @Override
    public void tinhDienTich(){
        double DienTich=cd*cr;
        System.out.println("Dien tich Chu Nhat  "+DienTich);
    }
}
