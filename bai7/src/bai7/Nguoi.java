package bai7;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen319;
    protected Date ngaySinh;
    protected String queQuan;

    public Nguoi() {}
    public Nguoi(String hoTen319, Date ngaySinh, String queQuan) {
        this.hoTen319 = hoTen319;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhap ho ten: ");
        hoTen319 = sc.nextLine();
        System.out.print("\tNhap ngay sinh (dd-MM-yyyy): ");
        String strDate = sc.nextLine();
        ngaySinh = strToDate(strDate);
        System.out.print("\tNhap que quan: ");
        queQuan = sc.nextLine();
    }

    private Date strToDate(String strDate) {
        Date date = null;
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try { date = sdf.parse(strDate); } 
        catch (ParseException e) { System.out.println("Loi dinh dang ngay thang!"); }
        return date;
    }

    public void hienThiThongTin() {
        System.out.println("\tHo ten: " + hoTen319);
        System.out.println("\tNgay sinh: " + dateToString(ngaySinh));
        System.out.println("\tQue quan: " + queQuan);
    }

    private String dateToString(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(date);
    }

    public String getQueQuan() { return queQuan; }
    public Date getNgaySinh() { return ngaySinh; }
}
