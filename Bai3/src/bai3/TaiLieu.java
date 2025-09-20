/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author huynh
 */

public class TaiLieu {
    protected String maTL319;
    protected String tenNXB319;
    protected int soBanPH319;

    public TaiLieu() {}

    public TaiLieu(String maTL319, String tenNXB319, int soBanPH319) {
        this.maTL319 = maTL319;
        this.tenNXB319 = tenNXB319;
        this.soBanPH319 = soBanPH319;
    }

    public void hienThi319() {
        System.out.println("Ma TL: " + maTL319);
        System.out.println("Nha XB: " + tenNXB319);
        System.out.println("So ban PH: " + soBanPH319);
    }

    public String getMaTL319() {
        return maTL319;
    }
}
