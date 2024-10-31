/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.BH;

import controller.ControllerFile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import model.BH.BaoHiemXeMay;

public class ControllerQLBH extends ControllerFile {

    public BaoHiemXeMay searchByMaBH(TreeSet<BaoHiemXeMay> list, String ma) {
        for(BaoHiemXeMay bh : list) {
            if(bh.getMaBH().equals(ma)) {
                return bh;
            }
        }
        return null;
    }
    
    public ArrayList searchByChuXe(TreeSet<BaoHiemXeMay> list, String ten) {
        ArrayList list2 = new ArrayList<>();
        for(BaoHiemXeMay bh : list) {
            if(bh.getXe().getChuSoHuu().getHoTen().equals(ten)) {
                list2.add(bh);
            }
        }
        return list2;
    }
    
    
    public void SortByLoaiXe(ArrayList<BaoHiemXeMay> list) {
        Comparator<BaoHiemXeMay> c = new Comparator<BaoHiemXeMay>() {
            @Override
            public int compare(BaoHiemXeMay o1, BaoHiemXeMay o2) {
                return o1.getXe().getLoaiXe().compareTo(o2.getXe().getLoaiXe());
            }
        };
        list.sort(c);
    }
    
    public void SortByPhiBH(ArrayList<BaoHiemXeMay> list) {
        Comparator<BaoHiemXeMay> c = new Comparator<BaoHiemXeMay>() {
            @Override
            public int compare(BaoHiemXeMay o1, BaoHiemXeMay o2) {
                return (int)(o1.getPhiBH() - o2.getPhiBH());
            }
        };
        list.sort(c);
    }
}
