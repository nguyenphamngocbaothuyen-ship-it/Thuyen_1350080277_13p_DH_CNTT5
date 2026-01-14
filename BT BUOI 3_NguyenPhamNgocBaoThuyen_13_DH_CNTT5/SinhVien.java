package buoi3;
import java.util.Scanner;

public class SinhVien {
    private String Ten;
    private String NgaySinh;
    private String GioiTinh;
    private String Lop;
    public SinhVien(){
    }
    public void  nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap ten:");
        Ten=sc.nextLine();
        System.out.println("Nhap Ngay sinh");
        NgaySinh=sc.nextLine();
        System.out.println("Nhap Gioi Tinh");
        GioiTinh=sc.nextLine();
        System.out.println("Nhap lop:");
        Lop=sc.nextLine();
    }
    public void xuat() {
        System.out.println("Tên: " + Ten);
        System.out.println("Ngày sinh: " + NgaySinh);
        System.out.println("Giới tính: " + GioiTinh);
        System.out.println("Lớp: " + Lop);
    }
}
