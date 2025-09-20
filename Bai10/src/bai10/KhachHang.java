package bai10;
import java.util.Scanner;

public class KhachHang {
    protected String tenChuHo;
    protected int soNha;
    protected String maCongTo;

    public KhachHang() {}
    public KhachHang(String tenChuHo, int soNha, String maCongTo) {
        this.tenChuHo = tenChuHo;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("Nhap ten chu ho: "); tenChuHo = sc.nextLine();
        System.out.print("Nhap so nha: "); soNha = sc.nextInt(); sc.nextLine();
        System.out.print("Nhap ma cong to: "); maCongTo = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("Ten chu ho: " + tenChuHo);
        System.out.println("So nha: " + soNha);
        System.out.println("Ma cong to: " + maCongTo);
    }
}
