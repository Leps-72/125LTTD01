/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author huynh
 */
public class Sach extends TaiLieu {
    private String tacGia319;
    private int soTrang319;

    public Sach(String maTL319, String tenNXB319, int soBanPH319, String tacGia319, int soTrang319) {
        super(maTL319, tenNXB319, soBanPH319);
        this.tacGia319 = tacGia319;
        this.soTrang319 = soTrang319;
    }

    @Override
    public void hienThi319() {
        super.hienThi319();
        System.out.println("Tac gia: " + tacGia319);
        System.out.println("So trang: " + soTrang319);
    }
}

