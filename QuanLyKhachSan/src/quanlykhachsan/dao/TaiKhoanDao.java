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
public class TaiKhoanDao {
    Session session = null;
    List<Taikhoan> tkList;
    public TaiKhoanDao() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
    
    @SuppressWarnings("unchecked")
    public List<Taikhoan> getTKList() {
        tkList = new ArrayList<Taikhoan>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Taikhoan ");
            tkList = (List<Taikhoan>) q.list();
            tx.commit();
        } catch (Exception e) {
            tkList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
            //session.close();
        }
        return tkList;
    }
    @SuppressWarnings("unchecked")
     public List<Taikhoan> timTkByUser(String user) {
        tkList = new ArrayList<Taikhoan>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Taikhoan where account = '" + user + "'");
            tkList = (List<Taikhoan>) q.list();
            tx.commit();
        } catch (Exception e) {
            tkList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
           // session.close();
        }
        return tkList;
    }
     
     public boolean themTK(Taikhoan tk) {
        boolean kq = true;
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
           session.save(tk);
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
     public boolean suaTK(Taikhoan tk) {
        boolean kq = true;
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
           session.update(tk);
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
     
     public boolean xoaTK(Taikhoan tk) {
        boolean kq = true;
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
           session.delete(tk);
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
