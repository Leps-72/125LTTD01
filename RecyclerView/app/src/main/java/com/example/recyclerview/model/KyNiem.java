package com.example.recyclerview.model;

public class KyNiem {
    private String tieuDe;
    private int hinhAnh;

    public KyNiem(String tieuDe, int hinhAnh) {
        this.tieuDe = tieuDe;
        this.hinhAnh = hinhAnh;
    }

    public String getTieuDe() { return tieuDe; }
    public int getHinhAnh() { return hinhAnh; }
}
