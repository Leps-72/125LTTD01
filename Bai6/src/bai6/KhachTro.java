/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

/**
 *
 * @author huynh
 */
import java.util.Date;
import java.util.Scanner;

public class KhachTro extends Nguoi {
    // Thuoc tinh
    private int soNgayTro319;
    private String loaiPhong;
    private double giaPhong;

    // Ham khoi tao khong doi so
    public KhachTro() {
        super();
    }

    // Ham khoi tao co doi so
    public KhachTro(String hoTen319, Date ngaySinh, int CMND, int soNgayTro319, String loaiPhong, double giaPhong) {
        super(hoTen319, ngaySinh, CMND); // goi constructor lop cha
        this.soNgayTro319 = soNgayTro319;
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    // Nhap thong tin
    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("\tNhap so ngay tro: ");
        soNgayTro319 = sc.nextInt();
        sc.nextLine();

        System.out.print("\tNhap loai phong: ");
        loaiPhong = sc.nextLine().trim();

        System.out.print("\tNhap gia phong: ");
        giaPhong = sc.nextDouble();
        sc.nextLine();
    }

    // Hien thi thong tin
    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo ngay tro: " + soNgayTro319);
        System.out.println("\tLoai phong: " + loaiPhong);
        System.out.println("\tGia phong: " + giaPhong);
    }

    // Getter
    public int getSoNgayTro() {
        return soNgayTro319;
    }

    public double getGiaPhong() {
        return giaPhong;
    }
}
