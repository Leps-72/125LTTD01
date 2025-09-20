/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author huynh
 */

public class QLCB {
    private ArrayList<CanBo> danhSach319 = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Nhap can bo moi
    public void nhapCanBo319() {
        System.out.println("\nChon loai can bo: 1-CongNhan, 2-KySu, 3-NhanVien");
        int loai = sc.nextInt();
        sc.nextLine(); // bỏ Enter

        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        String ngaySinh = sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        String gioiTinh = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = sc.nextLine();

        if (loai == 1) {
            System.out.print("Nhap bac cong nhan: ");
            String bac = sc.nextLine();
            danhSach319.add(new CongNhan(hoTen, ngaySinh, gioiTinh, diaChi, bac));
        } else if (loai == 2) {
            System.out.print("Nhap nganh dao tao: ");
            String nganh = sc.nextLine();
            danhSach319.add(new KySu(hoTen, ngaySinh, gioiTinh, diaChi, nganh));
        } else if (loai == 3) {
            System.out.print("Nhap cong viec: ");
            String cv = sc.nextLine();
            danhSach319.add(new NhanVien(hoTen, ngaySinh, gioiTinh, diaChi, cv));
        }
    }

    // Tim kiem theo ho ten
    public void timKiem319(String ten) {
        for (CanBo cb : danhSach319) {
            if (cb.getHoTen319().equalsIgnoreCase(ten)) {
                cb.hienThi319();
                return;
            }
        }
        System.out.println("Khong tim thay can bo ten: " + ten);
    }

    // Hien thi danh sach
    public void hienThiDS319() {
        for (CanBo cb : danhSach319) {
            cb.hienThi319();
            System.out.println("---------------");
        }
    }

    public static void main(String[] args) {
        QLCB ql = new QLCB();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n===== MENU QLCB =====");
            System.out.println("1. Nhap can bo moi");
            System.out.println("2. Tim kiem theo ho ten");
            System.out.println("3. Hien thi tat ca can bo");
            System.out.println("0. Thoat");
            System.out.print("Moi chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    ql.nhapCanBo319();
                    break;
                case 2:
                    System.out.print("Nhap ten can tim: ");
                    String ten = sc.nextLine();
                    ql.timKiem319(ten);
                    break;
                case 3:
                    ql.hienThiDS319();
                    break;
                case 0:
                    System.out.println("Thoat.");
                    break;
                default:
                    System.out.println("Lua chon sai!");
            }

        } while (choice != 0);
    }
}

