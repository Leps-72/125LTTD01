package bai9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
    private int soMuon;
    private Date ngayMuon;
    private Date hanTra;
    private String soHieu;

    public TheMuon() {}

    public TheMuon(int soMuon, Date ngayMuon, String soHieu) {
        this.soMuon = soMuon;
        this.ngayMuon = ngayMuon;
        this.soHieu = soHieu;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);

        System.out.print("\tNhap so muon: ");
        soMuon = sc.nextInt(); sc.nextLine();

        System.out.print("\tNhap ngay muon (dd-MM-yyyy): ");
        ngayMuon = strToDate(sc.nextLine());

        // mặc định hạn trả cuối năm
        hanTra = strToDate("31-12-2020");

        System.out.print("\tNhap so hieu: ");
        soHieu = sc.nextLine();
    }

    private Date strToDate(String str) {
        try {
            return new SimpleDateFormat("dd-MM-yyyy").parse(str);
        } catch (ParseException e) {
            System.out.println("Loi dinh dang ngay thang!");
            return null;
        }
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSo phieu muon: " + soMuon);
        System.out.println("\tNgay muon: " + ngayMuon);
        System.out.println("\tHan tra: " + hanTra);
        System.out.println("\tSo hieu: " + soHieu);
    }

    public Date getHanTra() {
        return hanTra;
    }
}
