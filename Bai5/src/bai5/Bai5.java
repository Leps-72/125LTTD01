/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai5;

/**
 *
 * @author huynh
 */
import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhuPho qlkp = new KhuPho();
        qlkp.nhapDanhSach(sc);
        System.out.println("\nDanh sach ho dan co nguoi tu 80 tuoi tro len:");
        qlkp.timKiemThongTin();

        sc.close();
    }
}
