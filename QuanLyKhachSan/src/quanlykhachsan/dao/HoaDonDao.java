/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import quanlykhachsan.entity.HibernateUtil;
import quanlykhachsan.entity.*;
/**
 *
 * @author Phung
 */
public class HoaDonDao {
     Session session = null;
    List<Hoadon> lkhachList;
    public HoaDonDao() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
    
     public boolean themHoaDon(Hoadon p) {
        boolean kq = true;
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
           session.save(p);
            tx.commit();
        } catch (Exception e) {
            kq = false;
            tx.rollback();
            e.printStackTrace();
        }finally {
            //session.close();
        }
        return kq;
    }
}
