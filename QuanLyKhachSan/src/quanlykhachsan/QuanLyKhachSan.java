/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import quanlykhachsan.*;
import quanlykhachsan.view.*;
import quanlykhachsan.dao.*;
import quanlykhachsan.entity.*;


/**
 *
 * @author Phung
 */
public class QuanLyKhachSan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* ImagePanel panel = new ImagePanel(new ImageIcon("D:/LegendSoft/Images/bg1.jpg").getImage());
        MainMenuFrame menu = new MainMenuFrame();
        menu.getContentPane().add(panel);
        menu.setVisible(true);
        menu.setDefaultCloseOperation( javax.swing.JFrame.DISPOSE_ON_CLOSE);*/
       
       LoginFrame lg = new LoginFrame();
       lg.setVisible(true);
       lg.setDefaultCloseOperation( javax.swing.JFrame.DISPOSE_ON_CLOSE);
    }
    
}
