/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan.view;

import java.awt.Component;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import quanlykhachsan.*;
import quanlykhachsan.view.*;
import quanlykhachsan.dao.*;
import quanlykhachsan.entity.*;
/**
 *
 * @author Phung
 */
public class DSPhongTrongFrame extends javax.swing.JFrame {

    /**
     * Creates new form DSPhongTrongFrame
     */
    DefaultTableModel modeltable;
    DefaultComboBoxModel modelCombox;
    
    PhongDao pDao = new PhongDao();
    LoaiPhongDao lpDao = new LoaiPhongDao();
    String tenPhongChon = "";
    float donGia = 0;
    String tinhTrang = "";
    public DSPhongTrongFrame() {
        initComponents();
         ImagePanel panel = new ImagePanel(new ImageIcon("D:/LegendSoft/Images/bg12.jpg").getImage());
        getContentPane().add(panel);
        
         ImageIcon iconThue = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/key.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        this.btnThue.setIcon(iconThue);
        
        ImageIcon iconTim = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/search.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        this.btnTim.setIcon(iconTim);
        
         ImageIcon iconExit = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/exit6.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        this.btnExit.setIcon(iconExit);
        
        String [] ColumNames={"STT", "Phòng","Loại Phòng", "Đơn Giá", "Tình trạng"}; 
        modeltable = new DefaultTableModel(null , ColumNames);
        
        List<Phong> pTList = pDao.getPhongTrongList();
        hienThiDsPhong(pTList);
        
        modelCombox = (DefaultComboBoxModel) cmbLoaiPhong.getModel();
       List<Loaiphong> lpList = lpDao.getLoaiPhongList();
       hienthidsloaip(lpList);
       
       this.cmbLoaiPhong.setSelectedIndex(0);
       this.txtTenPhongChon.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quanlykhachsanPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("quanlykhachsanPU").createEntityManager();
        loaiphong_1Query = java.beans.Beans.isDesignTime() ? null : quanlykhachsanPUEntityManager.createQuery("SELECT l FROM Loaiphong_1 l");
        loaiphong_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : loaiphong_1Query.getResultList();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTenPhong = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnTim = new javax.swing.JButton();
        btnThue = new javax.swing.JButton();
        txtTenPhongChon = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        cmbLoaiPhong = new javax.swing.JComboBox<>();
        cbLoaiPhong = new javax.swing.JCheckBox();
        cbTenPhong = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Danh sách tất cả các phòng trống");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Tên phòng");

        txtTenPhong.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Phòng", "Loại phòng", "Đơn giá", "Tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnTim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTim.setText("Tìm");
        btnTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimMouseClicked(evt);
            }
        });

        btnThue.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnThue.setText("Thuê");
        btnThue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThueMouseClicked(evt);
            }
        });

        txtTenPhongChon.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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

        cmbLoaiPhong.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbLoaiPhong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbLoaiPhong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbLoaiPhongItemStateChanged(evt);
            }
        });

        cbLoaiPhong.setBackground(new java.awt.Color(255, 255, 255));
        cbLoaiPhong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbLoaiPhong.setText("Tên loại phòng");

        cbTenPhong.setBackground(new java.awt.Color(255, 255, 255));
        cbTenPhong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbTenPhong.setText("Tên phòng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnThue, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                    .addComponent(txtTenPhongChon)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbTenPhong)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(164, 164, 164)
                                .addComponent(cbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbLoaiPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbLoaiPhong)
                            .addComponent(cbTenPhong)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(75, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenPhongChon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThue, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))))
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

    private void btnThueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThueMouseClicked
        // TODO add your handling code here:
        if(!this.txtTenPhongChon.getText().equals(""))
        {
            ThueFrame thue = new ThueFrame(txtTenPhongChon.getText(), donGia);
            thue.setVisible(true);
            thue.setDefaultCloseOperation( javax.swing.JFrame.DISPOSE_ON_CLOSE);
        }
        else
        {
            JOptionPane.showConfirmDialog((Component) null, "Hãy chọn tên phòng cần thuê", "Yêu cầu", JOptionPane.CLOSED_OPTION);
        }
        
    }//GEN-LAST:event_btnThueMouseClicked

    private void cmbLoaiPhongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbLoaiPhongItemStateChanged
        // TODO add your handling code here:
        //this.setTitle( ((Loaiphong)cmbLoaiPhong.getSelectedItem()).getTenLoai()+"");
    }//GEN-LAST:event_cmbLoaiPhongItemStateChanged

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        // TODO add your handling code here:
        List<Phong> pTList = null; 
        boolean kt = true;
        if(cbTenPhong.isSelected() == false && this.cbLoaiPhong.isSelected() == false)
        {
            JOptionPane.showConfirmDialog((Component) null, "Vui lòng check tên hay loại phòng muốn tìm", "Thông báo", JOptionPane.CLOSED_OPTION);
            kt = false;
        }
        else
        {
            Loaiphong lps = (Loaiphong) this.cmbLoaiPhong.getSelectedItem();

            if(this.cbTenPhong.isSelected() && this.txtTenPhong.getText() != "" && this.cbLoaiPhong.isSelected())
            {
                pTList = pDao.timPhongTrongByLoaiTen(txtTenPhong.getText(), lps.getMaLoai());
            }
            else
            {
                if(this.cbTenPhong.isSelected() && this.txtTenPhong.getText() != "")
                {
                    pTList = pDao.timPhongTrongByTen(txtTenPhong.getText());
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
                
            }
        }
        if(kt == true)
        {
            if(pTList == null || pTList.isEmpty())
            {
                JOptionPane.showConfirmDialog((Component) null, "Tên hoặc loại phòng không có hoặc đã cho thuê", "Thông báo", JOptionPane.CLOSED_OPTION);
            }
            else
            {
                hienThiDsPhong(pTList);
            }
        }
        
    }//GEN-LAST:event_btnTimMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        JTable source = (JTable)evt.getSource();
        int row = source.rowAtPoint( evt.getPoint() );
        int column = source.columnAtPoint( evt.getPoint() );
        if(jTable1.getSelectedRow() != -1)
        {
           int index = jTable1.getSelectedRow();
           String TenPhong = (String)(modeltable.getValueAt(index,1));
           this.txtTenPhongChon.setText(TenPhong);
           //donGia = (float)(modeltable.getValueAt(index,2));
           tinhTrang = (String)(modeltable.getValueAt(index,3));
        }
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(DSPhongTrongFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DSPhongTrongFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DSPhongTrongFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DSPhongTrongFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DSPhongTrongFrame().setVisible(true);
            }
        });
    }
    void hienthidsloaip(List <Loaiphong> dsloaip) {

        modelCombox.removeAllElements();
        for (int i = 0; i < dsloaip.size(); i++) {
            Loaiphong a = (Loaiphong) dsloaip.get(i);
            modelCombox.addElement(a);

        }
    }
    
    void hienThiDsPhong(List <Phong> dsp)
    {  
        modeltable.getDataVector().removeAllElements();
       // modeltable.fireTableDataChanged(); 
       LoaiPhongDao lpDao = new LoaiPhongDao();
       for(int i=0;i<dsp.size();i++)
        {     
            Phong s = (Phong) dsp.get(i);
            Loaiphong lp = lpDao.TonTai(s.getMaLoai());
          // if(s.getTinhTrang().equals("Trong"))
           // {
                Object[] items = new Object[]{i+1,s.getTenPhong(), lp.getTenLoai(), lp.getDonGia(), s.getTinhTrang()};
                modeltable.addRow(items);
            //}
        }
        jTable1.setModel(modeltable);
        jTable1.setRowHeight(30);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(10);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(3).setPreferredWidth(30);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnThue;
    private javax.swing.JButton btnTim;
    private javax.swing.JCheckBox cbLoaiPhong;
    private javax.swing.JCheckBox cbTenPhong;
    private javax.swing.JComboBox<String> cmbLoaiPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private java.util.List<quanlykhachsan.Loaiphong_1> loaiphong_1List;
    private javax.persistence.Query loaiphong_1Query;
    private javax.persistence.EntityManager quanlykhachsanPUEntityManager;
    private javax.swing.JTextField txtTenPhong;
    private javax.swing.JTextField txtTenPhongChon;
    // End of variables declaration//GEN-END:variables
}
