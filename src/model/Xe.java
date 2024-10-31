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
public class Xe implements Serializable {
    private String bienSoXe;
    private String loaiXe;
    private Nguoi chuSoHuu;

    public Xe() {
    }

    public Xe(String bienSoXe, String loaiXe, Nguoi chuSoHuu) {
        try {
            setBienSoXe(bienSoXe);
            setLoaiXe(loaiXe);
            setChuSoHuu(chuSoHuu);
        } catch (Exception e) {
            System.out.println("Co loi du lieu Xe " + e.toString());
        }
    }

    public String getBienSoXe() {
        return bienSoXe;
    }

    public void setBienSoXe(String bienSoXe) throws Exception {
        if(bienSoXe.trim().equals("")) {
            throw new Exception("Bien so xe khong duoc de trong");
        }
        this.bienSoXe = bienSoXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) throws Exception {
        if(loaiXe.trim().equals("")) {
            throw new Exception("Loai xe khong duoc de trong");
        }
        this.loaiXe = loaiXe;
    }

    public Nguoi getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(Nguoi chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "Xe{" + "bienSoXe=" + bienSoXe + ", loaiXe=" + loaiXe + ", chuSoHuu=" + chuSoHuu + '}';
    }
}
