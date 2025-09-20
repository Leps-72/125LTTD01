/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai6;

/**
 *
 * @author huynh
 */
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhachSan ql = new KhachSan();
        // Nhap danh sach khach
        ql.nhapDanhSach(sc);
        // Hien thi danh sach vua nhap
        ql.hienThiDanhSach();
        // Tinh tien cho mot khach theo CMND
        System.out.print("\nNhap CMND khach tro can tinh tien: ");
        int cmnd = sc.nextInt();
        double tongTien = ql.tinhTien(cmnd);

        if (tongTien > 0) {
            System.out.println("==> Tong tien phai tra: " + tongTien);
        }

        sc.close();
    }
}

