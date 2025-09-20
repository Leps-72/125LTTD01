/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai6;

/**
 *
 * @author huynh
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    // Thuoc tinh
    protected String hoTen319;
    protected Date ngaySinh;
    protected int CMND;  // Nen dung String de luu so CMND chinh xac hon

    // Ham khoi tao khong doi so
    public Nguoi() {
    }

    // Ham khoi tao co doi so
    public Nguoi(String hoTen319, Date ngaySinh, int CMND) {
        this.hoTen319 = hoTen319;
        this.ngaySinh = ngaySinh;
        this.CMND = CMND;
    }

    // Nhap thong tin
    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ho ten: ");
        hoTen319 = sc.nextLine().trim();

        // nhap ngay sinh va kiem tra hop le
        System.out.print("\tNhap ngay sinh (dd-MM-yyyy): ");
        while (true) {
            String strDate = sc.nextLine().trim();
            ngaySinh = strToDate(strDate);
            if (ngaySinh != null) break;
            System.out.print("\tNgay sinh khong hop le, vui long nhap lai (dd-MM-yyyy): ");
        }

        System.out.print("\tNhap CMND: ");
        CMND = sc.nextInt();
        sc.nextLine(); // tranh loi troi lenh
    }

    // Chuyen String -> Date
    private Date strToDate(String strDate) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(false); // kiem tra chat che ngay thang
        try {
            return sdf.parse(strDate);
        } catch (ParseException e) {
            return null;
        }
    }

    // Hien thi thong tin
    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen319);
        System.out.println("\tNgay sinh: " + dateToString(ngaySinh));
        System.out.println("\tCMND: " + CMND);
    }

    // Chuyen Date -> String
    private String dateToString(Date date) {
        if (date == null) return "Khong xac dinh";
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    // Getter CMND
    public int getCMND() {
        return CMND;
    }
}
