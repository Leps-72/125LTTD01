package bai10;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuanLy ql = new QuanLy();
        ql.nhapDanhSach(sc);

        System.out.println("Danh sach bien lai cua cac ho gia dinh:");
        ql.hienThiDanhSach();

        sc.close();
    }
}
