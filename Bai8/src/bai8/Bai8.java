package bai8;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLy ql = new QuanLy();
        ql.nhapDanhSach(sc);
        System.out.println("Danh sach nhung can bo co luong >= 8 trieu:");
        ql.timKiem(8000000);
        sc.close();
    }
}
