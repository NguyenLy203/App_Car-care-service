/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.HD;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import model.VatPham;

/**
 *
 * @author admin
 */
public class TableVatPham extends AbstractTableModel {
    //Khai báo xâu chứa tiêu đề của bảng vật phẩm.
    private String name[] = {"Vật phẩm", "Số lượng", "Đơn giá", "Thành tiền"};
    //Khai báo lớp Chứa kiểu dữ liệu của từng trường tương ứng.
    private Class classes[] = {String.class, Integer.class, Double.class, Double.class};      
    //Tạo một đối tượng arrayList có tên dsVP.
    ArrayList<VatPham> dsVP = new ArrayList<VatPham>();

    public TableVatPham(ArrayList<VatPham> ds) {
        dsVP = ds;
    }
    @Override
    public int getRowCount() {
       return dsVP.size();
    }

    @Override
    public int getColumnCount() {
        return  name.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch(columnIndex)
        {
            //Cột vật phẩm
            case 0: return dsVP.get(rowIndex).getTenVatPham(); 
            //Cột số lượng
            case 1: return dsVP.get(rowIndex).getSoLuong();
            //Cột đơn giá
            case 2: return dsVP.get(rowIndex).getDonGia();
            // cột thành tiền
            case 3: return dsVP.get(rowIndex).getDonGia() * dsVP.get(rowIndex).getSoLuong();
            default :return null;
        }
        
    }
     @Override
    public Class getColumnClass(int columnIndex)
    {
        return classes[columnIndex];
    }

    @Override
    public String getColumnName(int column)
    {
        return name[column];
    }    
}
