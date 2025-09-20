/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author huynh
 */

public class ThiSinhA extends ThiSinh {
    private final String khoi319 = "A";
    private final String mon319 = "Toan, Ly, Hoa";

    public ThiSinhA(String soBD319, String hoTen319, String diaChi319, String uuTien319) {
        super(soBD319, hoTen319, diaChi319, uuTien319);
    }

    @Override
    public void hienThi319() {
        super.hienThi319();
        System.out.println("Khoi: " + khoi319);
        System.out.println("Mon: " + mon319);
    }
}

