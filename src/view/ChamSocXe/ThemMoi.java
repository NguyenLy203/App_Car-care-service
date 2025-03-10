/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view.ChamSocXe;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import model.Nguoi;
import model.VatPham;
import model.ChamSocXe.QlyChamSocXe;
import view.HomeFrm;

/**
 *
 * @author nguyenhongson
 */
public class ThemMoi extends javax.swing.JDialog {

    private HomeFrm home;
    public ThemMoi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        home = (HomeFrm) parent;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBSX = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtChuSoHuu = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtSuaChua = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtSoLuong = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnHuyBo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNgaySua = new javax.swing.JTextField();
        comboLoaiXe = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("NHẬP THÔNG TIN");

        jLabel2.setText("Biển số xe:");

        txtBSX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBSXActionPerformed(evt);
            }
        });

        jLabel3.setText("Loại xe:");

        jLabel4.setText("Chủ sở hữu:");

        txtChuSoHuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChuSoHuuActionPerformed(evt);
            }
        });

        jLabel7.setText("Sửa chữa:");

        txtSuaChua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSuaChuaActionPerformed(evt);
            }
        });

        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        jLabel6.setText("SĐT:");

        jLabel8.setText("Số lượng:");

        jLabel9.setText("Đơn giá:");

        txtDonGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonGiaActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnHuyBo.setText("Hủy bỏ");
        btnHuyBo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyBoActionPerformed(evt);
            }
        });

        jLabel1.setText("Ngày sửa:");

        txtNgaySua.setToolTipText("dd/MM/yyyy");
        txtNgaySua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNgaySuaActionPerformed(evt);
            }
        });

        comboLoaiXe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Xe ga", "Xe số", "Xe côn" }));

        jLabel5.setText("ID:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtBSX)
                            .addComponent(txtSuaChua)
                            .addComponent(txtSDT)
                            .addComponent(txtChuSoHuu)
                            .addComponent(comboLoaiXe, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(87, 87, 87)
                                .addComponent(btnHuyBo))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSoLuong)
                                .addComponent(txtDonGia)
                                .addComponent(txtNgaySua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(195, 195, 195))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBSX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChuSoHuu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSuaChua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNgaySua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnHuyBo))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBSXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBSXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBSXActionPerformed

    private void txtChuSoHuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChuSoHuuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChuSoHuuActionPerformed

    private void txtSuaChuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSuaChuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSuaChuaActionPerformed

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtDonGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonGiaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        String maChamSoc, bienSoXe, loaiXe, tenChuSoHuu, sdt, suaChua;
        int soLuong = 0;
        double donGia = 0;
        LocalDate ngaySua = null;
        boolean isOK = true;

        maChamSoc = txtID.getText().trim();
        bienSoXe = txtBSX.getText().trim();
        loaiXe = comboLoaiXe.getSelectedItem().toString();
        tenChuSoHuu = txtChuSoHuu.getText().trim();
        sdt = txtSDT.getText().trim();
        suaChua = txtSuaChua.getText().trim();
        
        if (maChamSoc.isEmpty() || bienSoXe.isEmpty() || loaiXe.isEmpty() || tenChuSoHuu.isEmpty() || sdt.isEmpty() || suaChua.isEmpty()
                || txtSoLuong.getText().trim().isEmpty() || txtDonGia.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng điền đầy đủ thông tin!");
            isOK = false;
        }
        
        if (home.checkIdTrung(maChamSoc)) {
            JOptionPane.showMessageDialog(rootPane, "Mã chăm sóc đã tồn tại trong danh sách!");
            isOK = false;
        }
        
        if (!tenChuSoHuu.matches("[\\p{L} ]+")) {
            JOptionPane.showMessageDialog(rootPane, "Tên không được chứa kí tự số và các kí tự đặc biệt!");
            isOK = false;
        }
        
        if(sdt.length() != 10) {
            JOptionPane.showMessageDialog(rootPane, "SĐT không hợp lệ!");
            isOK = false;
        }
        
        try {
            soLuong = Integer.parseInt(txtSoLuong.getText().trim());
            if(soLuong <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Số lượng phải là số nguyên dương và không chứ kí tự chữ!");
            isOK = false;
        }

        try {
            donGia = Double.parseDouble(txtDonGia.getText().trim());
            if(donGia <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane, "Đơn giá phải lớn hơn 0 và không chứa kí tự chữ!");
            isOK = false;
        }

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            ngaySua = LocalDate.parse(txtNgaySua.getText().trim(), formatter);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Ngày chăm sóc không hợp lệ!");
            isOK = false;
        }

        if (isOK) {
            VatPham vatPham = new VatPham(suaChua, soLuong, donGia);
            Nguoi chuSoHuu = new Nguoi(tenChuSoHuu, sdt);

            QlyChamSocXe qly = new QlyChamSocXe(maChamSoc, vatPham, bienSoXe, loaiXe, chuSoHuu, ngaySua);

            home.addXe(qly);
            JOptionPane.showMessageDialog(rootPane, "Thêm thành công!");

//            txtID.setText("");
//            txtBSX.setText("");
//            txtChuSoHuu.setText("");
//            txtSDT.setText("");
//            txtSuaChua.setText("");
//            txtSoLuong.setText("");
//            txtDonGia.setText("");
//            txtNgaySua.setText("");
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnHuyBoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyBoActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnHuyBoActionPerformed

    private void txtNgaySuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNgaySuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNgaySuaActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemMoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThemMoi dialog = new ThemMoi(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuyBo;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> comboLoaiXe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBSX;
    private javax.swing.JTextField txtChuSoHuu;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNgaySua;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtSuaChua;
    // End of variables declaration//GEN-END:variables
}
