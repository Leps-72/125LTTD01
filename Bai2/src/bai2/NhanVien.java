/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author huynh
 */

public class NhanVien extends CanBo {
    private String congViec319;

    public NhanVien(String hoTen319, String ngaySinh319, String gioiTinh319, String diaChi319, String congViec319) {
        super(hoTen319, ngaySinh319, gioiTinh319, diaChi319);
        this.congViec319 = congViec319;
    }

    @Override
    public void hienThi319() {
        super.hienThi319();
        System.out.println("Cong viec: " + congViec319);
    }
}
