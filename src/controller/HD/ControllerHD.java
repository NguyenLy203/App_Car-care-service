/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.HD;

import controller.ControllerFile;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
import model.HD.HoaDon;

/**
 *
 * @author admin
 */
public class ControllerHD extends ControllerFile {
    
    public HoaDon searchByMaHD(TreeSet ds, int maHD) { 
        Iterator bir = ds.iterator();
        for (HoaDon hd; bir.hasNext();) {
            hd = (HoaDon) bir.next();
            if (hd.getMaHD() == maHD) {
                return hd;
            }
        }
        return null;
    }
    
    public ArrayList searchByKH(TreeSet ds, String tenKH) {
        ArrayList<HoaDon> ds2 = new ArrayList<>();
        Iterator bir = ds.iterator();
        for (HoaDon hd; bir.hasNext();) {
            hd = (HoaDon) bir.next();
            if (hd.getKhachHang().getHoTen().equals(tenKH)) {
                ds2.add(hd);
            }
        }
        return ds2;
    }

    public ArrayList sortByTien(TreeSet ds) {
        ArrayList<HoaDon> ds2 = new ArrayList<>(ds);
        ds2.sort(new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                return Double.compare(o1.tongTien(), o2.tongTien());
            }
        });
        return ds2;
    }
    
    public ArrayList sortByTime(TreeSet ds) {
        ArrayList<HoaDon> ds2 = new ArrayList<>(ds);
        ds2.sort(new Comparator<HoaDon>() {
            @Override
            public int compare(HoaDon o1, HoaDon o2) {
                LocalDate date1 = o1.getThoiGian();
                LocalDate date2 = o2.getThoiGian();
                return date2.compareTo(date1);
            }
        });
        return ds2;
    }
}
