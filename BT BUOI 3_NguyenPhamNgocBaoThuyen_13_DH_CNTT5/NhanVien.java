package buoi3;
import java.util.Scanner;

public class NhanVien {
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private double luong;
    public NhanVien() {
    }
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên: ");
        ten = sc.nextLine();

        System.out.print("Nhập ngày sinh: ");
        ngaySinh = sc.nextLine();

        System.out.print("Nhập giới tính: ");
        gioiTinh = sc.nextLine();

        System.out.print("Nhập lương: ");
        luong = sc.nextDouble();
    }
    public void xuat() {
        System.out.println("Tên: " + ten);
        System.out.println("Ngày sinh: " + ngaySinh);
        System.out.println("Giới tính: " + gioiTinh);
        System.out.println("Lương: " + luong);
    }
}
