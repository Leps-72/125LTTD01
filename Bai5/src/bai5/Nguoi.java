/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author huynh
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    private String hoTen319;
    private Date ngaySinh319;
    private String ngheNghiep319;

    public Nguoi() {}

    public Nguoi(String hoTen319, Date ngaySinh319, String ngheNghiep319) {
        this.hoTen319 = hoTen319;
        this.ngaySinh319 = ngaySinh319;
        this.ngheNghiep319 = ngheNghiep319;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ho ten: ");
        hoTen319 = sc.nextLine();
        System.out.print("\tNhap ngay sinh (dd-MM-yyyy): ");
        String strDate = sc.nextLine();
        ngaySinh319 = strToDate(strDate);
        System.out.print("\tNhap nghe nghiep: ");
        ngheNghiep319 = sc.nextLine();
    }

    private Date strToDate(String strDate) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = sdf.parse(strDate);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang!");
        }
        return date;
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen319);
        System.out.println("\tNgay sinh: " + dateToString(ngaySinh319));
        System.out.println("\tNghe nghiep: " + ngheNghiep319);
    }

    private String dateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    public Date getNgaySinh() {
        return ngaySinh319;
    }
}
