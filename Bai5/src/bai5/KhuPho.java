/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author huynh
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<HoDan> dshd;

    public KhuPho() {
        dshd = new ArrayList<HoDan>(10);
    }

    public void themHoDan(HoDan hoDan319) {
        dshd.add(hoDan319);
    }

    public void nhapDanhSach(Scanner sc) {
        System.out.print("Nhap so ho dan: ");
        int soHoDan = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < soHoDan; i++) {
            System.out.println("Ho dan thu " + (i + 1) + ":");
            HoDan hoDan319 = new HoDan();
            hoDan319.nhapThongTin(sc);
            themHoDan(hoDan319);
        }
    }

    public void hienThiDanhSach() {
        for (int i = 0; i < dshd.size(); i++) {
            System.out.println("Ho dan thu " + (i + 1) + ":");
            dshd.get(i).hienThiThongTin();
        }
    }

    public void timKiemThongTin() {
        Date now = new Date();
        int namHienTai = now.getYear() + 1900;
        for (HoDan hoDan319 : dshd) {
            Nguoi[] dstv = hoDan319.getList();
            for (int i = 0; i < hoDan319.getSoNguoi(); i++) {
                if (namHienTai - (dstv[i].getNgaySinh().getYear() + 1900) >= 80) {
                    hoDan319.hienThiThongTin();
                    break;
                }
            }
        }
    }
}
