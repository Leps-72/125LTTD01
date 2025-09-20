/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author huynh
 */

public class CongNhan extends CanBo {
    private String bac319;

    public CongNhan(String hoTen319, String ngaySinh319, String gioiTinh319, String diaChi319, String bac319) {
        super(hoTen319, ngaySinh319, gioiTinh319, diaChi319);
        this.bac319 = bac319;
    }

    @Override
    public void hienThi319() {
        super.hienThi319();
        System.out.println("Bac cong nhan: " + bac319);
    }
}

