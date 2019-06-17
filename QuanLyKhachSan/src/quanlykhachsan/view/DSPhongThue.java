/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan.view;

import java.awt.Component;
import java.awt.Image;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
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
    PhieuThuePhongDao thuepDao = new PhieuThuePhongDao();
    HoaDonDao hdDao = new HoaDonDao();
    String tenPhongChon = "";
    int maPhieuThue = 0;
    public DSPhongThue() {
        initComponents();
        ImagePanel panel = new ImagePanel(new ImageIcon("D:/LegendSoft/Images/bg12.jpg").getImage());
        getContentPane().add(panel);
        setDefaultCloseOperation( javax.swing.JFrame.DISPOSE_ON_CLOSE);
        
         ImageIcon iconTra = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/cash.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        this.btnTra.setIcon(iconTra);
        
         ImageIcon iconTim = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/search.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        this.btnTim.setIcon(iconTim);
        
        ImageIcon iconIn = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/printer.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        this.btnIn.setIcon(iconIn);
        
        String [] ColumNames={"Mã phiếu thuê","Phòng","Tên khách hàng", "CMND", "Ngày thuê", "Giá tiền"}; 
        modeltable = new DefaultTableModel(null , ColumNames);    
       
       loadDSPhong();
       
       this.txtTenKH.setEditable(false);
       this.txtTenPhong.setEditable(false);
       this.txtTongTien.setEditable(false);
       this.txtSoNgay.setEditable(false);
       
    }
    
     public DSPhongThue(String tenPhongTra) {
        initComponents();
        ImagePanel panel = new ImagePanel(new ImageIcon("D:/LegendSoft/Images/bg12.jpg").getImage());
        getContentPane().add(panel);
        setDefaultCloseOperation( javax.swing.JFrame.DISPOSE_ON_CLOSE);
        
         ImageIcon iconTra = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/cash.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        this.btnTra.setIcon(iconTra);
        
         ImageIcon iconTim = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/search.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        this.btnTim.setIcon(iconTim);
        
        ImageIcon iconIn = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/printer.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        this.btnIn.setIcon(iconIn);
        
        String [] ColumNames={"Mã phiếu thuê","Phòng","Tên khách hàng", "CMND", "Ngày thuê", "Giá tiền"}; 
        modeltable = new DefaultTableModel(null , ColumNames);    
       
       
       
       this.txtTenKH.setEditable(false);
       this.txtTenPhong.setEditable(false);
       this.txtTongTien.setEditable(false);
       this.txtSoNgay.setEditable(false);
       
       
       // load danh sách phòng thuê được chọn
       List<Object[]> pTList = thuepDao.timThuePhongList(tenPhongTra);
       if(pTList == null || pTList.isEmpty())
        {
            JOptionPane.showConfirmDialog((Component) null, "Phòng này không đúng, vui lòng chọn phòng dưới đây", "Thông báo", JOptionPane.CLOSED_OPTION);
            loadDSPhong();
        }
        else
        {
            Object[] o = pTList.get(0);
            this.txtTenPhong.setText(tenPhongTra);
            this.txtTenKH.setText(String.valueOf(o[2]));
            float tien = (float) o[5]; 
           Date ngayThue = (Date)o[4];
           Date daynow = new Date();
           
           // tính số ngày thuê
          long getDiff = daynow.getTime() - ngayThue.getTime();
             // using TimeUnit class from java.util.concurrent package
            long getDaysDiff = TimeUnit.MILLISECONDS.toDays(getDiff);

            // Tính tổng tiền
            float tongtien = 0;
            if(getDaysDiff == 0)
            {
                tongtien = tien;
                this.txtSoNgay.setText("1");
            }
            else
            {
                 tongtien = tien * getDaysDiff;
                 this.txtSoNgay.setText(String.valueOf(getDaysDiff));
            }  
            this.txtTongTien.setText(String.valueOf(tongtien));
            hienThiDsPhongThue(pTList);
        }
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
        txtCMND = new javax.swing.JTextField();
        btnTim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtTenPhong = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        btnTra = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        btnIn = new javax.swing.JButton();
        cbTenPhong = new javax.swing.JCheckBox();
        cbCMND = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        txtTongTien = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtSoNgay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Danh sách phiếu thuê phòng");

        txtTenPhongTim.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtCMND.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Tổng tiền");

        txtTenPhong.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Tên phòng");

        txtTenKH.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnTra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnTra.setText("Tính tiền");
        btnTra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTraMouseClicked(evt);
            }
        });
        btnTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("VND");

        btnIn.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnIn.setText("In hóa đơn");

        cbTenPhong.setBackground(new java.awt.Color(255, 255, 255));
        cbTenPhong.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbTenPhong.setText("Tên phòng");
        cbTenPhong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTenPhongActionPerformed(evt);
            }
        });

        cbCMND.setBackground(new java.awt.Color(255, 255, 255));
        cbCMND.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cbCMND.setText("CMND");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Tên người thuê");

        txtTongTien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Số ngày thuê");

        txtSoNgay.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(txtSoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(35, 35, 35)
                                .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(30, 30, 30)
                                .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnTra, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenPhongTim, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTenPhong)
                    .addComponent(cbCMND)
                    .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGap(224, 224, 224))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTenPhong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(txtSoNgay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(txtTongTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11))
                    .addComponent(btnIn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbTenPhong)
                        .addGap(18, 18, 18)
                        .addComponent(txtTenPhongTim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbCMND)
                        .addGap(18, 18, 18)
                        .addComponent(txtCMND, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnTim, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimMouseClicked
        // TODO add your handling code here:
        List<Object[]> pTList = null; 
        boolean kt = true;
        if(cbTenPhong.isSelected() == false && this.cbCMND.isSelected() == false)
        {
            JOptionPane.showConfirmDialog((Component) null, "Vui lòng check tên hay loại phòng  muốn tìm", "Thông báo", JOptionPane.CLOSED_OPTION);
            kt = false;
            loadDSPhong();
        }
        else
        {
           // pTList = thuepDao.getThuePhongList(this.txtTenPhongTim.getText());
            //Loaiphong lps = (Loaiphong) this.cmbLoaiPhongTim.getSelectedItem();
            if(this.cbTenPhong.isSelected() && this.txtTenPhongTim.getText() != "" && this.cbCMND.isSelected())
            {
                pTList = thuepDao.timThuePhongList(this.txtTenPhongTim.getText(), this.txtCMND.getText());
            }
            else
            {
                if(this.cbTenPhong.isSelected() && this.txtTenPhongTim.getText() != "")
                {
                    pTList = thuepDao.timThuePhongList(this.txtTenPhongTim.getText());
                }
                else
                {
                    if(this.cbCMND.isSelected())
                    {
                        
                        pTList = thuepDao.timThuePhongListByCMND(this.txtCMND.getText());
                    }
                    else
                    {
                         JOptionPane.showConfirmDialog((Component) null,  "Vui lòng check tên hay CMND muốn tìm", "Thông báo", JOptionPane.CLOSED_OPTION);
                         kt = false;
                    }
                }
                
            }
        }
        if(kt == true)
        {
            if(pTList == null || pTList.isEmpty())
            {
                JOptionPane.showConfirmDialog((Component) null, "Tên hoặc CMND không đúng", "Thông báo", JOptionPane.CLOSED_OPTION);
            }
            else
            {
                hienThiDsPhongThue(pTList);
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
           String TenKH = (String)(modeltable.getValueAt(index,2));
           this.txtTenPhong.setText(TenPhong);
           this.txtTenKH.setText(TenKH);
           float tien = (float)(modeltable.getValueAt(index,5)); 
           Date ngayThue = (Date)(modeltable.getValueAt(index,4));
           Date daynow = new Date();
           
           // tính số ngày thuê
          long getDiff = daynow.getTime() - ngayThue.getTime();
             // using TimeUnit class from java.util.concurrent package
            long getDaysDiff = TimeUnit.MILLISECONDS.toDays(getDiff);

            // Tính tổng tiền
            float tongtien = 0;
            if(getDaysDiff == 0)
            {
                tongtien = tien;
                this.txtSoNgay.setText("1");
            }
            else
            {
                 tongtien = tien * getDaysDiff;
                 this.txtSoNgay.setText(String.valueOf(getDaysDiff));
            }  
            this.txtTongTien.setText(String.valueOf(tongtien));
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTraActionPerformed

    private void cbTenPhongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTenPhongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTenPhongActionPerformed

    private void btnTraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraMouseClicked
        // TODO add your handling code here:
        if(jTable1.getSelectedRow() != -1)
        {
           int index = jTable1.getSelectedRow();
           int maphieu = (int)(modeltable.getValueAt(index,0));
           boolean kq = false;
           List <Object[]> lst = thuepDao.timChiTietThuePhongList(maphieu);
           if(lst.isEmpty() || lst == null)
           {
               JOptionPane.showConfirmDialog((Component) null, "Phòng này đã được trả", "Thông báo", JOptionPane.CLOSED_OPTION);
           }
           else
           {
               Object[] o = lst.get(0);
                Date daynow = new Date();
                int maphong = (int) o[0];
                Hoadon hd = new Hoadon(maphong,maphieu,o[2].toString(),o[3].toString(),Float.valueOf(o[4].toString()),Integer.valueOf(this.txtSoNgay.getText()), Float.valueOf(this.txtTongTien.getText()),daynow,false);
                kq = hdDao.themHoaDon(hd);
                thuepDao.traPhong(maphieu);
                pDao.traPhong(maphong);
                if(kq == true)
                {
                    JOptionPane.showConfirmDialog((Component) null, "Đã thanh toán xong, tổng tiền là " + this.txtTongTien.getText(), "Thông báo", JOptionPane.CLOSED_OPTION);
                     loadDSPhong();
                }
           } 
           
        }
        else
        {
            JOptionPane.showConfirmDialog((Component) null, "Vui lòng chọn trong danh sách", "Thông báo", JOptionPane.CLOSED_OPTION);

        }
        
        
    }//GEN-LAST:event_btnTraMouseClicked

   void loadDSPhong()
    {
        List<Object[]> pTList = thuepDao.getThuePhongList();
        hienThiDsPhongThue(pTList);
    }
    void hienThiDsPhongThue(List <Object[]> dsp)
    {  
        modeltable.getDataVector().removeAllElements();
       // modeltable.fireTableDataChanged(); 
       LoaiPhongDao lpDao = new LoaiPhongDao();
       for(int i=0;i<dsp.size();i++)
        {     
            Object[] s = (Object[]) dsp.get(i);
          // if(s.getXoa() == false)
          //  {
               // Loaiphong lp = lpDao.TonTai(s.getMaLoai());
                Object[] items = new Object[]{s[0], s[1], s[2], s[3], s[4], s[5]};
                modeltable.addRow(items);
           // }
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
    private javax.swing.JButton btnIn;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTra;
    private javax.swing.JCheckBox cbCMND;
    private javax.swing.JCheckBox cbTenPhong;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtCMND;
    private javax.swing.JTextField txtSoNgay;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTenPhong;
    private javax.swing.JTextField txtTenPhongTim;
    private javax.swing.JTextField txtTongTien;
    // End of variables declaration//GEN-END:variables
}
