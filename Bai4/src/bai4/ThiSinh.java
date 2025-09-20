/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author huynh
 */
public class ThiSinh {
    protected String soBD319;
    protected String hoTen319;
    protected String diaChi319;
    protected String uuTien319;

    public ThiSinh() {}

    public ThiSinh(String soBD319, String hoTen319, String diaChi319, String uuTien319) {
        this.soBD319 = soBD319;
        this.hoTen319 = hoTen319;
        this.diaChi319 = diaChi319;
        this.uuTien319 = uuTien319;
    }

    public void hienThi319() {
        System.out.println("So BD: " + soBD319);
        System.out.println("Ho ten: " + hoTen319);
        System.out.println("Dia chi: " + diaChi319);
        System.out.println("Uu tien: " + uuTien319);
    }

    public String getSoBD319() {
        return soBD319;
    }
}
