/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Nguoi implements Serializable {
    private String hoTen;
    private String diaChi;
    private String sdt;

    public Nguoi() {
    }

    public Nguoi(String hoTen, String diaChi, String sdt) {
        try {
            setHoTen(hoTen);
            setDiaChi(diaChi);
            setSdt(sdt);
        } catch(Exception e) {
            System.out.println("Co loi du lieu Nguoi khong hop le " + e.toString());
        }  
    }
    
    public Nguoi(String hoTen, String sdt) {
        try {
            setHoTen(hoTen);
            setSdt(sdt);
        } catch(Exception e) {
            System.out.println("Co loi du lieu Nguoi khong hop le " + e.toString());
        } 
    }

    public Nguoi(String hoTen) {
        try{
            setHoTen(hoTen);       
        }
        catch(Exception e) {
            System.out.println("Co loi du lieu Nguoi khong hop le " + e.toString());  
        }
       
    }
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) throws Exception {
        if(hoTen.trim().equals("")) {
            throw new Exception("Tên không được để trống");
        } else if(hoTen.matches("[^a-zA-Z]+")) {
            throw new Exception("Tên không được có kí tự số");
        }
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) throws Exception {
        if(diaChi.trim().equals("")) {
            throw new Exception("Địa chỉ không được để trống");
        }
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) throws Exception {
        if(sdt.length() != 10) {
            throw new Exception("SDT khong hop le");   
        }
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "hoTen=" + hoTen + ", diaChi=" + diaChi + ", sdt=" + sdt + '}';
    }
}