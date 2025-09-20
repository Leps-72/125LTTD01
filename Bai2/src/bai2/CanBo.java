/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author huynh
 */
public class CanBo {
    protected String hoTen319;
    protected String ngaySinh319;
    protected String gioiTinh319;
    protected String diaChi319;

    public CanBo() {}

    public CanBo(String hoTen319, String ngaySinh319, String gioiTinh319, String diaChi319) {
        this.hoTen319 = hoTen319;
        this.ngaySinh319 = ngaySinh319;
        this.gioiTinh319 = gioiTinh319;
        this.diaChi319 = diaChi319;
    }

    public void hienThi319() {
        System.out.println("Ho ten: " + hoTen319);
        System.out.println("Ngay sinh: " + ngaySinh319);
        System.out.println("Gioi tinh: " + gioiTinh319);
        System.out.println("Dia chi: " + diaChi319);
    }

    public String getHoTen319() {
        return hoTen319;
    }
}
