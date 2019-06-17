/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan.view;

import java.awt.Component;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javafx.scene.paint.Color;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import quanlykhachsan.*;
import quanlykhachsan.dao.*;
import quanlykhachsan.entity.*;
/**
 *
 * @author Phung
 */
public class MainMenuFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainMenuFrame
     */
    //JButton jbut = new JButton("jButton1");
    public MainMenuFrame() {
        initComponents();
        
        ImagePanel panel = new ImagePanel(new ImageIcon("D:/LegendSoft/Images/bg1.jpg").getImage());
        getContentPane().add(panel);
        setDefaultCloseOperation( javax.swing.JFrame.DISPOSE_ON_CLOSE);
         
        JMenuBar menubar = new JMenuBar();
        ImageIcon icon = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/exit1.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
  
        JMenuItem eMenuItem = new JMenuItem("Exit", icon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0); 
            }
        });
        file.add(eMenuItem);
        menubar.add(file);
  
        setJMenuBar(menubar);
        setTitle("LegendSoft - Khách sạn Legend - 987 Đường Nguyễn Văn Cừ. P1. Q10");
        
        // button mượn phòng room
        ImageIcon iconKey = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/key2.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
        this.btnKey.setIcon(iconKey);
        
       // button danh sách phòng
       ImageIcon iconRoom = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/hotel.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
       this.btnRoom.setIcon(iconRoom);
       
       //btn Nhan vien
       ImageIcon iconNV = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/user.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
       this.btnNhanVien.setIcon(iconNV);
       
       
       // button doanh thu
        ImageIcon iconDiagram = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/diagram.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
        this.btnDoanhThu.setIcon(iconDiagram);
        
        //button Setting
        ImageIcon iconSetting = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/setting2.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
        this.btnSetting.setIcon(iconSetting);
        
        // button tra phong
        ImageIcon iconTra = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/exit4.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
        this.btnTra.setIcon(iconTra);
        
        //btn Exit
        ImageIcon iconExit = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/exit6.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        this.btnExit.setIcon(iconExit);
       
    }

    public MainMenuFrame(int loaitk) {
        initComponents();
        
        ImagePanel panel = new ImagePanel(new ImageIcon("D:/LegendSoft/Images/bg1.jpg").getImage());
        getContentPane().add(panel);
        setDefaultCloseOperation( javax.swing.JFrame.DISPOSE_ON_CLOSE);
         
        JMenuBar menubar = new JMenuBar();
        ImageIcon icon = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/exit1.png").getImage().getScaledInstance(40, 40, Image.SCALE_DEFAULT));
        JMenu file = new JMenu("File");
        file.setMnemonic(KeyEvent.VK_F);
  
        JMenuItem eMenuItem = new JMenuItem("Exit", icon);
        eMenuItem.setMnemonic(KeyEvent.VK_E);
        eMenuItem.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0); 
            }
        });
        file.add(eMenuItem);
        menubar.add(file);
  
        setJMenuBar(menubar);
        setTitle("LegendSoft - Khách sạn Legend - 987 Đường Nguyễn Văn Cừ. P1. Q10");
        
        // button mượn phòng room
        ImageIcon iconKey = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/key2.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
        this.btnKey.setIcon(iconKey);
        
       // button danh sách phòng
       ImageIcon iconRoom = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/hotel.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
       this.btnRoom.setIcon(iconRoom);
       
       //btn Nhan vien
       ImageIcon iconNV = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/user.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
       this.btnNhanVien.setIcon(iconNV);
       
       
       // button doanh thu
        ImageIcon iconDiagram = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/diagram.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
        this.btnDoanhThu.setIcon(iconDiagram);
        
        //button Setting
        ImageIcon iconSetting = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/setting2.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
        this.btnSetting.setIcon(iconSetting);
        
        // button tra phong
        ImageIcon iconTra = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/exit4.png").getImage().getScaledInstance(60,60, Image.SCALE_DEFAULT));
        this.btnTra.setIcon(iconTra);
        
        //btn Exit
        ImageIcon iconExit = new ImageIcon(new ImageIcon("D:/LegendSoft/Images/exit6.png").getImage().getScaledInstance(40,40, Image.SCALE_DEFAULT));
        this.btnExit.setIcon(iconExit);
       
        if(loaitk != 1)
        {
            this.btnNhanVien.setEnabled(false);
            this.btnDoanhThu.setEnabled(false);
            this.btnSetting.setEnabled(false);
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

        btnRoom = new javax.swing.JButton();
        btnKey = new javax.swing.JButton();
        btnDoanhThu = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        btnTra = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnNhanVien = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        btnRoom.setText("phong");
        btnRoom.setActionCommand("jHotel");
        btnRoom.setAlignmentY(0.0F);
        btnRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRoomMouseClicked(evt);
            }
        });

        btnKey.setText("thue");
        btnKey.setAlignmentY(0.0F);
        btnKey.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnKeyMouseClicked(evt);
            }
        });
        btnKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeyActionPerformed(evt);
            }
        });

        btnDoanhThu.setText("TK");
        btnDoanhThu.setAlignmentY(0.0F);
        btnDoanhThu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnDoanhThu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDoanhThuMouseClicked(evt);
            }
        });

        btnSetting.setText("set");
        btnSetting.setAlignmentY(0.0F);

        btnTra.setText("tra");
        btnTra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTraMouseClicked(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.setAlignmentY(0.0F);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Adorable", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LegendSoft");

        btnNhanVien.setText("NV");
        btnNhanVien.setActionCommand("jHotel");
        btnNhanVien.setAlignmentY(0.0F);
        btnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseClicked(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKey, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 940, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKey, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)))
                .addComponent(btnTra, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(btnRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnKeyActionPerformed

    private void btnKeyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnKeyMouseClicked
        // TODO add your handling code here:
        DSPhongTrongFrame room = new DSPhongTrongFrame();
        room.setVisible(true);
        room.setDefaultCloseOperation( javax.swing.JFrame.DISPOSE_ON_CLOSE);
        /* JOptionPane.showConfirmDialog((Component) null, "User không được cho phép vào phòng chat", "Thông báo",  JOptionPane.OK_OPTION);
         testin test = new testin();
         test.setVisible(true);
        test.setDefaultCloseOperation( javax.swing.JFrame.DISPOSE_ON_CLOSE);*/
        
    }//GEN-LAST:event_btnKeyMouseClicked

    private void btnRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRoomMouseClicked
        // TODO add your handling code here:
        
        DSPhongFrame room = new DSPhongFrame();
        room.setVisible(true);
        room.setDefaultCloseOperation( javax.swing.JFrame.DISPOSE_ON_CLOSE);
        
     
    }//GEN-LAST:event_btnRoomMouseClicked

    private void btnTraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTraMouseClicked
        // TODO add your handling code here:
        DSPhongThue room = new DSPhongThue();
        room.setVisible(true);
         room.setDefaultCloseOperation( javax.swing.JFrame.DISPOSE_ON_CLOSE);
        
    }//GEN-LAST:event_btnTraMouseClicked

    private void btnDoanhThuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDoanhThuMouseClicked
        // TODO add your handling code here:
        BaoCaoFrame room = new BaoCaoFrame();
        room.setVisible(true);
         room.setDefaultCloseOperation( javax.swing.JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnDoanhThuMouseClicked

    private void btnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseClicked
        // TODO add your handling code here:
         NhanVienFrame nv = new NhanVienFrame();
        nv.setVisible(true);
         nv.setDefaultCloseOperation( javax.swing.JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnNhanVienMouseClicked

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenuFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenuFrame().setVisible(true);
            }
        });
    }

    void setIconImage(String backgroundjpg) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDoanhThu;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnKey;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnRoom;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnTra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables

}
