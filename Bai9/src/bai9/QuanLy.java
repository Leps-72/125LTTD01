package bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<TheMuon> ds;

    public QuanLy() {
        ds = new ArrayList<>(10);
    }

    public void themTheMuon(TheMuon theMuon) {
        ds.add(theMuon);
    }

    public void nhapDanhSach(Scanner sc) {
        System.out.print("Nhap vao so luong the muon: ");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("The muon thu " + (i + 1) + ":");
            TheMuon tm = new TheMuon();
            tm.nhapThongTin(sc);
            themTheMuon(tm);
        }
    }

    public void hienThiDanhSachTraCuoiThang() {
        for (TheMuon tm : ds) {
            int ngay = tm.getHanTra().getDate();
            if (ngay == 30 || ngay == 31) tm.hienThiThongTin();
        }
    }
}
