/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

/**
 *
 * @author huynh
 */
import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    private ArrayList<KhachTro> ds;

    public KhachSan() {
        ds = new ArrayList<>(10);
    }

    // Them khach tro vao danh sach
    public void themKhachTro(KhachTro kt) {
        ds.add(kt);
    }

    // Nhap danh sach khach tro
    public void nhapDanhSach(Scanner sc) {
        System.out.print("Nhap vao so luong khach: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Nhap thong tin khach tro:");
        for (int i = 0; i < n; i++) {
            System.out.println("Khach tro thu " + (i + 1) + ":");
            KhachTro khach = new KhachTro();
            khach.nhapThongTin(sc);
            themKhachTro(khach);
        }
    }

    // Hien thi danh sach
    public void hienThiDanhSach() {
        System.out.println("\nDanh sach khach tro:");
        for (KhachTro khach : ds) {
            khach.hienThiThongTin();
            System.out.println("-------------------");
        }
    }

    // Tinh tien phong theo CMND
    public double tinhTien(int CMND) {
        for (KhachTro khach : ds) {
            if (khach.getCMND() == CMND) {
                return khach.getSoNgayTro() * khach.getGiaPhong();
            }
        }
        System.out.println("Khong tim thay khach co CMND: " + CMND);
        return 0;
    }
}
