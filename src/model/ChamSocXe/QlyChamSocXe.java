package model.ChamSocXe;

import java.io.Serializable;
import model.Nguoi;
import model.VatPham;
import model.Xe;

import java.time.LocalDate;  
import java.util.Objects;

public class QlyChamSocXe extends Xe implements Serializable {
    private VatPham vatPham;
    private LocalDate ngaySua;
    private String maChamSoc;
    
    public QlyChamSocXe() {
    }

    public QlyChamSocXe(String maChamSoc, VatPham vatPham, String bienSoXe, String loaiXe, Nguoi chuSoHuu, 
            LocalDate ngaySua) {
        super(bienSoXe, loaiXe, chuSoHuu);
        this.vatPham = vatPham;
        try {
            setNgaySua(ngaySua);       
            setMaChamSoc(maChamSoc);
        } catch(Exception e) {
            System.out.println("Có lỗi dữ liệu không hợp lệ " + e.toString());
        }
    }
    
    public VatPham getVatPham() {
        return vatPham;
    }

    public void setVatPham(VatPham vatPham) {
        this.vatPham = vatPham;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.maChamSoc);
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
        final QlyChamSocXe other = (QlyChamSocXe) obj;
        return Objects.equals(this.maChamSoc, other.maChamSoc);
    }
    
    

    public LocalDate getNgaySua() {
        return ngaySua;
    }

    public void setNgaySua(LocalDate ngaySua) throws Exception {
        if(ngaySua == null) {
            throw new Exception("Ngày chăm sóc không được để trống");
        }
        this.ngaySua = ngaySua;
    }

    public String getMaChamSoc() {
        return maChamSoc;
    }

    public void setMaChamSoc(String maChamSoc) throws Exception {
        if(maChamSoc.trim().equals("")) {
            throw new Exception("Mã chăm sóc không được để trống");
        }
        this.maChamSoc = maChamSoc;
    }
    
    public double thanhTien() {
        return vatPham.getDonGia() * vatPham.getSoLuong();
    }
}
