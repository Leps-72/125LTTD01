package bai8;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<CBGV> ds;

    public QuanLy() {
        ds = new ArrayList<>(10);
    }

    public void themCBGV(CBGV cb) {
        ds.add(cb);
    }

    public void nhapDanhSach(Scanner sc) {
        System.out.print("Nhap vao so luong can bo: ");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Can bo thu " + (i + 1) + ":");
            CBGV cb = new CBGV();
            cb.nhapThongTin(sc);
            themCBGV(cb);
        }
    }

    public void hienThiDanhSach() {
        for (CBGV cb : ds) cb.hienThiThongTin();
    }

    public void timKiem(double luong) {
        for (CBGV cb : ds)
            if (cb.getLuongThucLinh() >= luong)
                cb.hienThiThongTin();
    }
}
