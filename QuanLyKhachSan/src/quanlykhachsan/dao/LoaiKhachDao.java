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
import quanlykhachsan.*;
import quanlykhachsan.entity.*;
/**
 *
 * @author Phung
 */
public class LoaiKhachDao {
     Session session = null;
    List<Loaikhach> lkhachList;
    public LoaiKhachDao() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
     @SuppressWarnings("unchecked")
    public List<Loaikhach> getlKhachList() {
        lkhachList = new ArrayList<Loaikhach>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Loaikhach");
            lkhachList = (List<Loaikhach>) q.list();
            tx.commit();
        } catch (Exception e) {
            lkhachList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
           // session.close();
        }
        return lkhachList;
    }
    
    public Loaikhach TonTai(String TenKhach)
    {
        Loaikhach lp = null;
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Loaikhach where TenLoai = '" + TenKhach +"'");
            lp = (Loaikhach) q.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
            return null;
        }finally {
           // session.close();
        }
        return lp;
    }
    
    public Loaikhach getLoaiByID(int id)
    {
        Loaikhach lp = null;
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Loaikhach where MaLoai = " + id);
            lp = (Loaikhach) q.uniqueResult();
            tx.commit();
        } catch (Exception e) {
            e.printStackTrace();
            tx.rollback();
            return null;
        }finally {
           // session.close();
        }
        return lp;
    }
}
