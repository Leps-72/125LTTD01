package bai10;
import java.util.Scanner;

public class BienLai extends KhachHang {
    private int chiSoMoi, chiSoCu;
    private double tien;

    public BienLai() {}
    public BienLai(int chiSoMoi, int chiSoCu, double tien) {
        this.chiSoMoi = chiSoMoi;
        this.chiSoCu = chiSoCu;
        this.tien = tien;
    }
    public BienLai(String tenChuHo, int soNha, String maCongTo, int chiSoMoi, int chiSoCu) {
        super(tenChuHo, soNha, maCongTo);
        this.chiSoMoi = chiSoMoi;
        this.chiSoCu = chiSoCu;
        this.tien = (chiSoMoi - chiSoCu) * 750;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("Nhap chi so moi: "); chiSoMoi = sc.nextInt();
        System.out.print("Nhap chi so cu: "); chiSoCu = sc.nextInt(); sc.nextLine();
        tien = (chiSoMoi - chiSoCu) * 750;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("Chi so moi: " + chiSoMoi);
        System.out.println("Chi so cu: " + chiSoCu);
        System.out.println("Tien: " + tien);
    }
}
