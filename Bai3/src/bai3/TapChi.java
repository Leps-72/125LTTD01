/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai3;

/**
 *
 * @author huynh
 */
public class TapChi extends TaiLieu {
    private int soPH319;
    private int thangPH319;

    public TapChi(String maTL319, String tenNXB319, int soBanPH319, int soPH319, int thangPH319) {
        super(maTL319, tenNXB319, soBanPH319);
        this.soPH319 = soPH319;
        this.thangPH319 = thangPH319;
    }

    @Override
    public void hienThi319() {
        super.hienThi319();
        System.out.println("So phat hanh: " + soPH319);
        System.out.println("Thang phat hanh: " + thangPH319);
    }
}

