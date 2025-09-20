/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author huynh
 */

public class QuanLySach {
    private ArrayList<TaiLieu> ds319 = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Nhap tai lieu moi
    public void nhapTaiLieu319() {
        System.out.println("\nChon loai tai lieu: 1-Sach, 2-Tap chi, 3-Bao");
        int loai = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap ma TL: ");
        String ma = sc.nextLine();
        System.out.print("Nhap ten NXB: ");
        String nxb = sc.nextLine();
        System.out.print("Nhap so ban PH: ");
        int soBan = sc.nextInt();
        sc.nextLine();

        if (loai == 1) {
            System.out.print("Nhap ten tac gia: ");
            String tg = sc.nextLine();
            System.out.print("Nhap so trang: ");
            int trang = sc.nextInt();
            ds319.add(new Sach(ma, nxb, soBan, tg, trang));
        } else if (loai == 2) {
            System.out.print("Nhap so phat hanh: ");
            int soPH = sc.nextInt();
            System.out.print("Nhap thang phat hanh: ");
            int thangPH = sc.nextInt();
            ds319.add(new TapChi(ma, nxb, soBan, soPH, thangPH));
        } else if (loai == 3) {
            System.out.print("Nhap ngay phat hanh: ");
            String ngayPH = sc.nextLine();
            ds319.add(new Bao(ma, nxb, soBan, ngayPH));
        }
    }

    // Tim kiem theo ma TL
    public void timKiemMa319(String ma) {
        for (TaiLieu tl : ds319) {
            if (tl.getMaTL319().equalsIgnoreCase(ma)) {
                tl.hienThi319();
                return;
            }
        }
        System.out.println("Khong tim thay tai lieu co ma: " + ma);
    }

    // Tim kiem theo loai
    public void timKiemLoai319(Class<?> loai) {
        for (TaiLieu tl : ds319) {
            if (loai.isInstance(tl)) {
                tl.hienThi319();
                System.out.println("---------------");
            }
        }
    }

    // Hien thi tat ca
    public void hienThiDS319() {
        for (TaiLieu tl : ds319) {
            tl.hienThi319();
            System.out.println("---------------");
        }
    }

    // Main
    public static void main(String[] args) {
        QuanLySach ql = new QuanLySach();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n===== MENU QL TAI LIEU =====");
            System.out.println("1. Nhap tai lieu moi");
            System.out.println("2. Tim kiem theo ma TL");
            System.out.println("3. Tim kiem theo loai (Sach/TapChi/Bao)");
            System.out.println("4. Hien thi tat ca TL");
            System.out.println("0. Thoat");
            System.out.print("Moi chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    ql.nhapTaiLieu319();
                    break;
                case 2:
                    System.out.print("Nhap ma TL can tim: ");
                    String ma = sc.nextLine();
                    ql.timKiemMa319(ma);
                    break;
                case 3:
                    System.out.println("Chon loai: 1-Sach, 2-TapChi, 3-Bao");
                    int loai = sc.nextInt();
                    if (loai == 1) ql.timKiemLoai319(Sach.class);
                    else if (loai == 2) ql.timKiemLoai319(TapChi.class);
                    else if (loai == 3) ql.timKiemLoai319(Bao.class);
                    break;
                case 4:
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
