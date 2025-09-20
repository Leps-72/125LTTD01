/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author huynh
 */
public class Phanso {
    private int Tu319;
    private int Mau319;

    public Phanso() {
        Tu319 = 0;
        Mau319 = 1;
    }

    public Phanso(int tuso, int mauso) {
        if (mauso == 0) mauso = 1; 
        this.Tu319 = tuso;
        this.Mau319 = mauso;
        rutGon319();
    }

    public int getTu319() {
        return Tu319;
    }

    public int getMau319() {
        return Mau319;
    }

    private int UCLN319(int a, int b) {
        return (b == 0) ? a : UCLN319(b, a % b);
    }

    public void rutGon319() {
        int ucln = UCLN319(Math.abs(Tu319), Math.abs(Mau319));
        Tu319 /= ucln;
        Mau319 /= ucln;
        if (Mau319 < 0) { // mẫu luôn dương
            Tu319 *= -1;
            Mau319 *= -1;
        }
    }

    public boolean laToiGian319() {
        return UCLN319(Math.abs(Tu319), Math.abs(Mau319)) == 1;
    }

    public Phanso cong319(Phanso ps319) {
        return new Phanso(this.Tu319 * ps319.Mau319 + ps319.Tu319 * this.Mau319,
                          this.Mau319 * ps319.Mau319);
    }

    public Phanso tru319(Phanso ps319) {
        return new Phanso(this.Tu319 * ps319.Mau319 - ps319.Tu319 * this.Mau319,
                          this.Mau319 * ps319.Mau319);
    }

    public Phanso nhan319(Phanso ps319) {
        return new Phanso(this.Tu319 * ps319.Tu319,
                          this.Mau319 * ps319.Mau319);
    }

    public Phanso chia319(Phanso ps319) {
        return new Phanso(this.Tu319 * ps319.Mau319,
                          this.Mau319 * ps319.Tu319);
    }

    @Override
    public String toString() {
        return Tu319 + "/" + Mau319;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap tu so phan so 1: ");
        int tu1 = sc.nextInt();
        System.out.print("Nhap mau so phan so 1: ");
        int mau1 = sc.nextInt();
        Phanso ps1 = new Phanso(tu1, mau1);

        System.out.print("Nhap tu so phan so 2: ");
        int tu2 = sc.nextInt();
        System.out.print("Nhap mau so phan so 2: ");
        int mau2 = sc.nextInt();
        Phanso ps2 = new Phanso(tu2, mau2);

        int choice;
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Cong 2 phan so");
            System.out.println("2. Tru 2 phan so");
            System.out.println("3. Nhan 2 phan so");
            System.out.println("4. Chia 2 phan so");
            System.out.println("5. Rut gon phan so 1");
            System.out.println("6. Kiem tra phan so 1 co toi gian?");
            System.out.println("7. Hien thi 2 phan so");
            System.out.println("0. Thoat");
            System.out.print("Moi chon chuc nang: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Tong = " + ps1.cong319(ps2));
                    break;
                case 2:
                    System.out.println("Hieu = " + ps1.tru319(ps2));
                    break;
                case 3:
                    System.out.println("Tich = " + ps1.nhan319(ps2));
                    break;
                case 4:
                    System.out.println("Thuong = " + ps1.chia319(ps2));
                    break;
                case 5:
                    ps1.rutGon319();
                    System.out.println("Phan so 1 sau khi rut gon: " + ps1);
                    break;
                case 6:
                    System.out.println("Phan so 1 toi gian? " + ps1.laToiGian319());
                    break;
                case 7:
                    System.out.println("Phan so 1: " + ps1);
                    System.out.println("Phan so 2: " + ps2);
                    break;
                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (choice != 0);
    }
}
