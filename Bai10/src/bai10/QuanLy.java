package bai10;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<BienLai> ds;

    public QuanLy() {
        ds = new ArrayList<>();
    }

    public void themBienLai(BienLai bienLai) {
        ds.add(bienLai);
    }

    public void nhapDanhSach(Scanner sc) {
        System.out.print("Nhap so luong bien lai: ");
        int n = sc.nextInt(); sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Bien lai thu " + (i + 1) + ":");
            BienLai bl = new BienLai();
            bl.nhapThongTin(sc);
            themBienLai(bl);
        }
    }

    public void hienThiDanhSach() {
        for (int i = 0; i < ds.size(); i++) {
            System.out.println("Bien lai thu " + (i + 1) + ":");
            ds.get(i).hienThiThongTin();
            System.out.println();
        }
    }
}
