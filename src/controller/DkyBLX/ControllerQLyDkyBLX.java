/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.DkyBLX;

import controller.ControllerFile;
import java.util.ArrayList;
import java.util.Comparator;
import model.DkyBLX.QlyDkyBangLaiXe;

/**
 *
 * @author lamthanh
 */
public class ControllerQLyDkyBLX extends ControllerFile{
    public void sortByHoTen(ArrayList<QlyDkyBangLaiXe> x){
        x.sort(new Comparator<QlyDkyBangLaiXe>(){
            @Override
            public int compare(QlyDkyBangLaiXe o1, QlyDkyBangLaiXe o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
            
        });
    }
    
    public void sortByNgayDky(ArrayList<QlyDkyBangLaiXe> x){
        x.sort(new Comparator<QlyDkyBangLaiXe>(){
            @Override
            public int compare(QlyDkyBangLaiXe o1, QlyDkyBangLaiXe o2) {
                return o1.getNgayDky().compareTo(o2.getNgayDky());
            }
            
        });
    }
}
