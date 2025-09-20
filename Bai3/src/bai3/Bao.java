/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author huynh
 */
public class Bao extends TaiLieu {
    private String ngayPH319;

    public Bao(String maTL319, String tenNXB319, int soBanPH319, String ngayPH319) {
        super(maTL319, tenNXB319, soBanPH319);
        this.ngayPH319 = ngayPH319;
    }

    @Override
    public void hienThi319() {
        super.hienThi319();
        System.out.println("Ngay phat hanh: " + ngayPH319);
    }
}
