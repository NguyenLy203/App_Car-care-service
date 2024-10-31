/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.ChamSocXe;

import controller.ControllerFile;
import java.util.ArrayList;
import java.util.Comparator;
import model.ChamSocXe.QlyChamSocXe;

public class ControllerQlyChamSocXe extends ControllerFile {
    public void sortByThanhTien(ArrayList<QlyChamSocXe> x) {
        x.sort(new Comparator<QlyChamSocXe>() {
            @Override
            public int compare(QlyChamSocXe o1, QlyChamSocXe o2) {
                return Double.compare(o1.thanhTien(), o2.thanhTien());
            }
        }); 
    }
    public void sortByNgaySua(ArrayList<QlyChamSocXe> x) {
        x.sort(new Comparator<QlyChamSocXe>() {
            @Override
            public int compare(QlyChamSocXe o1, QlyChamSocXe o2) {
                return o2.getNgaySua().compareTo(o1.getNgaySua());
            }
        });
    }
    public ArrayList timKiemQLX(ArrayList<QlyChamSocXe> dsQly, String bsx) {
        ArrayList<QlyChamSocXe> list = new ArrayList<>();
        if(bsx.length() > 0) {
            for(QlyChamSocXe x : dsQly) {
                if(x.getBienSoXe().equals(bsx)) {
                    list.add(x);
                }
            }
        }
        return list;
    }
}
