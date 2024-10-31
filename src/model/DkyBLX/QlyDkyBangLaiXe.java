package model.DkyBLX;

import model.Nguoi;
import java.time.LocalDate;
import model.Xe;

public class QlyDkyBangLaiXe extends Nguoi {

    LocalDate ngayDky;
    String loaiBang;

    public QlyDkyBangLaiXe() {
    }

    public QlyDkyBangLaiXe(String hoTen, String diaChi, String sdt, LocalDate ngayDky, String loaiBang) {
        super(hoTen, diaChi, sdt);
        this.ngayDky = ngayDky;
        this.loaiBang = loaiBang;
    }

    public LocalDate getNgayDky() {
        return ngayDky;
    }

    public void setNgayDky(LocalDate ngayDky) {
        this.ngayDky = ngayDky;
    }

    public String getLoaiBang() {
        return loaiBang;
    }

    public void setLoaiBang(String loaiBang) {
        this.loaiBang = loaiBang;
    }
}
