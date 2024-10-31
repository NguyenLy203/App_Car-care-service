package model.BH;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;
import model.Nguoi;
import model.VatPham;
import model.Xe;

public class BaoHiemXeMay implements Serializable, Comparable<BaoHiemXeMay> {

    private Xe xe;
    private LocalDate ngayBatDau, ngayKetThuc;
    private String maBH;
    private double phiBH;
    private int soNam;

    public BaoHiemXeMay() {

    }

    public BaoHiemXeMay(Xe xe, LocalDate ngayBatDau, int soNam, String maBH) {
        try {
            this.xe = xe;
            setNgayBatDau(ngayBatDau);
            setSoNam(soNam);
            this.ngayKetThuc = ngayBatDau.plusYears(soNam);
            setMaBH(maBH);
            if (this.xe.getLoaiXe().equals("Dưới 50cc")) {
                this.phiBH = soNam * 55000;
            } else if (this.xe.getLoaiXe().equals("Trên 50cc")) {
                this.phiBH = soNam * 60000;
            } else {
                this.phiBH = soNam * 290000;
            }
        } catch (Exception e) {
            System.out.println("Lỗi dữ liệu: " + e.toString());
        }

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.xe);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final BaoHiemXeMay other = (BaoHiemXeMay) obj;
        return Objects.equals(this.xe, other.xe);
    }

    public Xe getXe() {
        return xe;
    }

    public void setXe(Xe xe) {
        this.xe = xe;
    }

    public LocalDate getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(LocalDate ngayBatDau) throws Exception {
        if (ngayBatDau == null) {
            throw new Exception("Lỗi dữ liệu thời gian!");
        }
        this.ngayBatDau = ngayBatDau;
    }

    public LocalDate getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(LocalDate ngayKetThuc) throws Exception {
        if (ngayKetThuc == null) {
            throw new Exception("Lỗi dữ liệu thời gian!");
        }
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getMaBH() {
        return maBH;
    }

    public void setMaBH(String maBH) throws Exception {
        if (maBH.trim().equals("")) {
            throw new Exception("Mã bảo hiểm không được để trống");
        }
        this.maBH = maBH;
    }

    public double getPhiBH() {
        return phiBH;
    }

    public void setPhiBH(double phiBH) {
        this.phiBH = phiBH;
    }

    public int getSoNam() {
        return soNam;
    }

    public void setSoNam(int soNam) throws Exception {
        if (soNam == 0) {
            throw new Exception("Số năm phải khác 0");
        }
        this.soNam = soNam;
    }

    @Override
    public int compareTo(BaoHiemXeMay o) {
        return this.maBH.compareTo(o.getMaBH());
    }

}
