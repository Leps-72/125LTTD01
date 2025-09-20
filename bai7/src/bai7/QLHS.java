package bai7;
import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
    private ArrayList<HocSinh> dshs;

    public QLHS() {
        dshs = new ArrayList<HocSinh>(10);
    }

    public void themHS(HocSinh hs) {
        dshs.add(hs);
    }

    public void nhapDanhSachHS(Scanner sc) {
        System.out.print("Nhap vao so luong hoc sinh: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Nhap thong tin cho cac hoc sinh:");
        for (int i = 0; i < n; i++) {
            System.out.println("\tHoc sinh thu " + (i + 1) + ":");
            HocSinh hs = new HocSinh();
            hs.nhapThongTin(sc);
            themHS(hs);
        }
    }

    public void hienThiDanhSach() {
        for (int i = 0; i < dshs.size(); i++) {
            System.out.println("\tHoc sinh thu " + (i + 1) + ":");
            dshs.get(i).hienThiThongTin();
        }
    }

    public void timKiemThongTin(int nam, String que) {
        for (HocSinh hs : dshs) {
            int namSinh = hs.getNgaySinh().getYear() + 1900;
            if (namSinh == nam && que.equals(hs.getQueQuan())) {
                hs.hienThiThongTin();
            }
        }
    }

    public void timKiemThongTin(String lop) {
        for (HocSinh hs : dshs) {
            if (lop.equals(hs.getLop())) {
                hs.hienThiThongTin();
            }
        }
    }
}
