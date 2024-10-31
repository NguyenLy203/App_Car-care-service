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
public class VatPham implements Serializable {
    private String tenVatPham;
    private int soLuong;
    private double donGia;

    public VatPham() {
    }

    public VatPham(String tenVatPham, int soLuong, double donGia) {
        try {
            setTenVatPham(tenVatPham);
            setSoLuong(soLuong);
            setDonGia(donGia);
        } catch (Exception e) {
            System.out.println("Lỗi dữ liệu: " + e.toString());
        }
    }

    public String getTenVatPham() {
        return tenVatPham;
    }

    public void setTenVatPham(String tenVatPham) throws Exception {
        if (tenVatPham.trim().equals("")) {
            throw new Exception("Lỗi bỏ trống dữ liệu!");
        }
        this.tenVatPham = tenVatPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) throws Exception {
        if(soLuong < 0) {
            throw new Exception("Số lượng không được nhỏ hơn 0 ");
        }
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) throws Exception {
        if(soLuong < 0) {
            throw new Exception("Đơn giá không được nhỏ hơn 0 ");
        }
        this.donGia = donGia;
    }
    public double tongTien() {
        return soLuong * donGia;
    }

    @Override
    public String toString() {
        return "VatPham{" + "tenVatPham=" + tenVatPham + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
    
    
}
