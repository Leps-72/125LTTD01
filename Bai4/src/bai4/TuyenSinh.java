/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author huynh
 */

public class TuyenSinh {
    private ArrayList<ThiSinh> ds319 = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    // Nhap thi sinh
    public void nhapThiSinh319() {
        System.out.println("\nChon khoi: 1-Khoi A, 2-Khoi B, 3-Khoi C");
        int loai = sc.nextInt();
        sc.nextLine();

        System.out.print("Nhap so bao danh: ");
        String soBD = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = sc.nextLine();
        System.out.print("Nhap dien uu tien: ");
        String uuTien = sc.nextLine();

        if (loai == 1) ds319.add(new ThiSinhA(soBD, hoTen, diaChi, uuTien));
        else if (loai == 2) ds319.add(new ThiSinhB(soBD, hoTen, diaChi, uuTien));
        else if (loai == 3) ds319.add(new ThiSinhC(soBD, hoTen, diaChi, uuTien));
    }

    // Hien thi thong tin
    public void hienThiDS319() {
        for (ThiSinh ts : ds319) {
            ts.hienThi319();
            System.out.println("---------------");
        }
    }

    // Tim kiem theo so BD
    public void timKiemSoBD319(String soBD) {
        for (ThiSinh ts : ds319) {
            if (ts.getSoBD319().equalsIgnoreCase(soBD)) {
                ts.hienThi319();
                return;
            }
        }
        System.out.println("Khong tim thay thi sinh co so BD: " + soBD);
    }

    // Main
    public static void main(String[] args) {
        TuyenSinh ql = new TuyenSinh();
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n===== MENU TUYEN SINH =====");
            System.out.println("1. Nhap thi sinh moi");
            System.out.println("2. Hien thi DS thi sinh");
            System.out.println("3. Tim kiem theo so BD");
            System.out.println("0. Thoat");
            System.out.print("Moi chon: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    ql.nhapThiSinh319();
                    break;
                case 2:
                    ql.hienThiDS319();
                    break;
                case 3:
                    System.out.print("Nhap so BD can tim: ");
                    String soBD = sc.nextLine();
                    ql.timKiemSoBD319(soBD);
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
