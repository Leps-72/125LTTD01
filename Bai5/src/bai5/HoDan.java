/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author huynh
 */
import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
    private int soNguoi319;
    private int soNha319;
    private Nguoi[] list;

    public HoDan() {
        list = new Nguoi[10];
    }

    public HoDan(String hoTen, Date ngaySinh, String ngheNghiep, int soNguoi319, int soNha319) {
        super(hoTen, ngaySinh, ngheNghiep);
        this.soNguoi319 = soNguoi319;
        this.soNha319 = soNha319;
        list = new Nguoi[soNguoi319];
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap so nguoi: ");
        soNguoi319 = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhap so nha: ");
        soNha319 = sc.nextInt();
        sc.nextLine();
        System.out.println("\tNhap thong tin tung nguoi trong ho:");
        for (int i = 0; i < soNguoi319; i++) {
            System.out.println("Nguoi thu " + (i + 1) + ":");
            list[i] = new Nguoi();
            list[i].nhapThongTin(sc);
        }
    }

    public void hienThiThongTin() {
        System.out.println("\tSo nguoi: " + soNguoi319);
        System.out.println("\tSo nha: " + soNha319);
        System.out.println("\tDanh sach thanh vien:");
        for (int i = 0; i < soNguoi319; i++) {
            System.out.println("Nguoi thu " + (i + 1) + ":");
            list[i].hienThiThongTin();
        }
    }

    public Nguoi[] getList() {
        return list;
    }

    public int getSoNguoi() {
        return soNguoi319;
    }
}
