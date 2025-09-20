package bai7;
import java.util.Scanner;

public class HocSinh extends Nguoi {
    private String lop319;
    private String khoaHoc;
    private String kyHoc;

    public HocSinh() {}
    public HocSinh(String hoTen319, String lop319, String khoaHoc, String kyHoc) {
        this.hoTen319 = hoTen319;
        this.lop319 = lop319;
        this.khoaHoc = khoaHoc;
        this.kyHoc = kyHoc;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhap lop: ");
        lop319 = sc.nextLine();
        System.out.print("\tNhap khoa hoc: ");
        khoaHoc = sc.nextLine();
        System.out.print("\tNhap ky hoc: ");
        kyHoc = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tLop: " + lop319);
        System.out.println("\tKhoa hoc: " + khoaHoc);
        System.out.println("\tKy hoc: " + kyHoc);
    }

    public String getLop() { return lop319; }
}
