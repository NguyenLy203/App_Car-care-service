/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.HD;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import model.Nguoi;
import model.VatPham;

/**
 *
 * @author admin
 */
public class HoaDon implements Serializable, Comparable<HoaDon>{
    private static int SmaHD = 1000000;
    private int maHD;
    private Nguoi KhachHang;
    private LocalDate thoiGian;
    private ArrayList<VatPham> dsVP;

    public HoaDon() {
    }

    public HoaDon(Nguoi KhachHang, LocalDate thoiGian, ArrayList<VatPham> dsVP) {
        try {
            this.maHD = SmaHD++;
            this.KhachHang = KhachHang;
            setThoiGian(thoiGian);
            setDsVP(new ArrayList<>(dsVP));
        } catch (Exception e) {
            System.out.println("Lỗi dữ liệu khởi tạo: "+ e.toString());
        }
    }

    public HoaDon(int maHD, Nguoi KhachHang, LocalDate thoiGian, ArrayList<VatPham> dsVP) {
         try {
            this.maHD = maHD;
            this.KhachHang = KhachHang;
            setThoiGian(thoiGian);
            setDsVP(new ArrayList<>(dsVP));
        } catch (Exception e) {
            System.out.println("Lỗi dữ liệu khởi tạo: "+ e.toString());
        }
    }

    public static int getSmaHD() {
        return SmaHD;
    }

    public static void setSmaHD(int SmaHD) {
        HoaDon.SmaHD = SmaHD;
    }

    public int getMaHD() {
        return maHD;
    }

    public void setMaHD(int maHD) {
        this.maHD = maHD;
    }

    public Nguoi getKhachHang() {
        return KhachHang;
    }

    public void setKhachHang(Nguoi KhachHang) {
        this.KhachHang = KhachHang;
    }

    public LocalDate getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(LocalDate thoiGian) throws Exception {
        if (thoiGian == null) {
            throw new Exception("Lỗi dữ liệu thời gian!");
        }
        this.thoiGian = thoiGian;
    }

    public ArrayList<VatPham> getDsVP() {
        return dsVP;
    }

    public void setDsVP(ArrayList<VatPham> dsVP) throws Exception {
        if (dsVP.isEmpty()) {
            throw new Exception("Lỗi dữ liệu dsVP trống!");
        }
        this.dsVP = dsVP;
    }
    
    public double tongTien() {
        double sum = 0;
        Iterator bir = dsVP.iterator();
        for(VatPham vp;bir.hasNext();) {
            vp = (VatPham) bir.next();
            sum += vp.getSoLuong()*vp.getDonGia();
        }
        return sum;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + this.maHD;
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
        final HoaDon other = (HoaDon) obj;
        return this.maHD == other.maHD;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "maHD=" + maHD + ", KhachHang=" + KhachHang + ", thoiGian=" + thoiGian + ", dsVP=" + dsVP + ", TT=" + tongTien() + '}';
    }
     
    @Override
    public int compareTo(HoaDon o) {
        return Integer.compare(this.getMaHD(), o.getMaHD());
    }
}
