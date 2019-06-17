/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan.view;

import java.awt.Component;
import java.awt.Image;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import quanlykhachsan.*;
import quanlykhachsan.dao.*;
import quanlykhachsan.entity.*;
/**
 *
 * @author Phung
 */
public class DSPhongThue extends javax.swing.JFrame {

    /**
     * Creates new form DSPhongThue
     */
     DefaultTableModel modeltable;
    
    PhongDao pDao = new PhongDao();
    LoaiPhongDao lpDao = new LoaiPhongDao();
    String tenPhongChon = "";
    
    public DSPhongThue() {
        initComponents();
        ImagePanel panel = new ImagePanel(new ImageIcon("D:/LegendSoft/Images/bg12.jpg").getImage());
        getContentPane().add(panel);
        setDefaultCloseOperation( javax.swing.JFrame.DISPOSE_ON_CLOSE);
        
        ImageIcon iconExit = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/exit2.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        this.btnExit.setIcon(iconExit);
        
         ImageIcon iconTra = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/cash.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        this.btnTra.setIcon(iconTra);
        
         ImageIcon iconTim = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/search.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        this.btnTim.setIcon(iconTim);
        
        ImageIcon iconIn = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/printer.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        this.btnIn.setIcon(iconIn);
        
        String [] ColumNames={"STT","Phòng","Loại Phòng", "Đơn Giá", "Tình trạng"}; 
        modeltable = new DefaultTableModel(null , ColumNames);
       
       loadDSPhong();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtTenPhongTim = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        btnTra = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        btnIn = new javax.swing.JButton();
        cbTenPhong = new javax.swing.JCheckBox();
        cbCMND = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Danh sách tất cả các phòng thuê");

        txtTenPhongTim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnTim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimMouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tổng tiền");

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tên người thuê");

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnTra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTra.setText("Tính tiền");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("VND");

        btnExit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnExit.setText("Thoát");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnIn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnIn.setText("In hóa đơn");

        cbTenPhong.setBackground(new java.awt.Color(255, 255, 255));
        cbTenPhong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbTenPhong.setText("Tên phòng");

        cbCMND.setBackground(new java.awt.Color(255, 255, 255));
        cbCMND.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbCMND.setText("CMND");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(224, 224, 224))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(cbTenPhong)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenPhongTim, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(cbCMND)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnTra, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel11)))
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(69, 69, 69))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField4)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenPhongTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTenPhong)
                    .addComponent(cbCMND))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(30, 30, 30)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(32, 32, 32)
                        .addComponent(btnTra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        // TODO add your handling code here:
        List<Phong> pTList = null; 
        boolean kt = true;
        if(cbTenPhong.isSelected() == false && this.cbCMND.isSelected() == false)
        {
            JOptionPane.showConfirmDialog((Component) null, "Vui lòng check tên hay loại phòng  muốn tìm", "Thông báo", JOptionPane.CLOSED_OPTION);
            kt = false;
            loadDSPhong();
        }
        else
        {
            //Loaiphong lps = (Loaiphong) this.cmbLoaiPhongTim.getSelectedItem();
           /* if(this.cbTenPhong.isSelected() && this.txtTenPhongTim.getText() != "" && this.cbCMND.isSelected())
            {
                pTList = pDao.timPhongTrongByLoaiTen(txtTenPhongTim.getText(), lps.getMaLoai());
            }
            else
            {
                if(this.cbTenPhong.isSelected() && this.txtTenPhongTim.getText() != "")
                {
                    pTList = pDao.timPhongTrongByTen(txtTenPhongTim.getText());
                }
                else
                {
                    if(this.cbLoaiPhong.isSelected())
                    {
                        
                        pTList = pDao.timPhongTrongByLoai(lps.getMaLoai());
                    }
                    else
                    {
                         JOptionPane.showConfirmDialog((Component) null,  "Vui lòng check tên hay loại phòng muốn tìm", "Thông báo", JOptionPane.CLOSED_OPTION);
                         kt = false;
                    }
                }
                
            }*/
        }
        if(kt == true)
        {
            if(pTList == null || pTList.isEmpty())
            {
                JOptionPane.showConfirmDialog((Component) null, "Tên hoặc loại phòng không có", "Thông báo", JOptionPane.CLOSED_OPTION);
            }
            else
            {
                hienThiDsPhong(pTList);
            }
        }
    }//GEN-LAST:event_btnTimMouseClicked

   void loadDSPhong()
    {
        List<Phong> pTList = pDao.getPhongList();
        hienThiDsPhong(pTList);
    }
    void hienThiDsPhong(List <Phong> dsp)
    {  
        modeltable.getDataVector().removeAllElements();
       // modeltable.fireTableDataChanged(); 
       LoaiPhongDao lpDao = new LoaiPhongDao();
       for(int i=0;i<dsp.size();i++)
        {     
            Phong s = (Phong) dsp.get(i);
           if(s.getXoa() == false)
            {
                Loaiphong lp = lpDao.TonTai(s.getMaLoai());
                Object[] items = new Object[]{i+1,s.getTenPhong(), lp.getTenLoai(), lp.getDonGia(), s.getTinhTrang(), s.getGhiChu()};
                modeltable.addRow(items);
            }
        }
        jTable1.setModel(modeltable);
        jTable1.setRowHeight(30);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(50);
    }
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
            java.util.logging.Logger.getLogger(DSPhongThue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSPhongThue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSPhongThue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSPhongThue.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DSPhongThue().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTra;
    private javax.swing.JCheckBox cbCMND;
    private javax.swing.JCheckBox cbTenPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField txtTenPhongTim;
    // End of variables declaration//GEN-END:variables
}
