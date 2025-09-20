/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author huynh
 */
public class KySu extends CanBo {
    private String nganhDaoTao319;

    public KySu(String hoTen319, String ngaySinh319, String gioiTinh319, String diaChi319, String nganhDaoTao319) {
        super(hoTen319, ngaySinh319, gioiTinh319, diaChi319);
        this.nganhDaoTao319 = nganhDaoTao319;
    }

    @Override
    public void hienThi319() {
        super.hienThi319();
        System.out.println("Nganh dao tao: " + nganhDaoTao319);
    }
}

