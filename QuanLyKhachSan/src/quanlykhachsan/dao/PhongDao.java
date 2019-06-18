/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import quanlykhachsan.*;
import quanlykhachsan.entity.*;
/**
 *
 * @author Phung
 */
public class PhongDao {
    Session session = null;
    List<Phong> phongList;
    public PhongDao() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }

    @SuppressWarnings("unchecked")
    public List<Phong> getPhongList() {
        phongList = new ArrayList<Phong>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Phong");
            phongList = (List<Phong>) q.list();
            tx.commit();
        } catch (Exception e) {
            phongList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
            //session.close();
        }
        return phongList;
    }
    
    @SuppressWarnings("unchecked")
     public List<Phong> getPhongTrongList() {
        phongList = new ArrayList<Phong>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Phong where TinhTrang = 'Trong'");
            phongList = (List<Phong>) q.list();
            tx.commit();
        } catch (Exception e) {
            phongList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
            //session.close();
        }
        return phongList;
    }
     
     @SuppressWarnings("unchecked")
     public List<Phong> timPhongByTen(String Ten) {
        phongList = new ArrayList<Phong>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Phong where TenPhong = '" + Ten + "'");
            phongList = (List<Phong>) q.list();
            tx.commit();
        } catch (Exception e) {
            phongList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
           // session.close();
        }
        return phongList;
    }
     @SuppressWarnings("unchecked")
     public List<Phong> timPhongTrongByTen(String Ten) {
        phongList = new ArrayList<Phong>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Phong where TinhTrang = 'Trong' and TenPhong = '" + Ten + "'");
            phongList = (List<Phong>) q.list();
            tx.commit();
        } catch (Exception e) {
            phongList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
           // session.close();
        }
        return phongList;
    }
     
     @SuppressWarnings("unchecked")
     public List<Phong> timPhongByLoai(int Loai) {
        phongList = new ArrayList<Phong>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Phong where MaLoai = " + Loai);
            phongList = (List<Phong>) q.list();
            tx.commit();
        } catch (Exception e) {
            phongList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
           // session.close();
        }
        return phongList;
    }
     @SuppressWarnings("unchecked")
     public List<Phong> timPhongTrongByLoai(int Loai) {
        phongList = new ArrayList<Phong>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Phong where TinhTrang = 'Trong' and MaLoai = " + Loai);
            phongList = (List<Phong>) q.list();
            tx.commit();
        } catch (Exception e) {
            phongList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
           // session.close();
        }
        return phongList;
    }
     @SuppressWarnings("unchecked")
     public List<Phong> timPhongByLoaiTen(String Ten, int Loai) {
        phongList = new ArrayList<Phong>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Phong where MaLoai = " + Loai + " and TenPhong = '" + Ten + "'");
            phongList = (List<Phong>) q.list();
            tx.commit();
        } catch (Exception e) {
            phongList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
            //session.close();
        }
        return phongList;
    }
     
     @SuppressWarnings("unchecked")
     public List<Phong> timPhongTrongByLoaiTen(String Ten, int Loai) {
        phongList = new ArrayList<Phong>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Phong where TinhTrang = 'Trong' and MaLoai = " + Loai + " and TenPhong = '" + Ten + "'");
            phongList = (List<Phong>) q.list();
            tx.commit();
        } catch (Exception e) {
            phongList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
            //session.close();
        }
        return phongList;
    }
     
     public boolean themPhong(Phong p) {
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
     public boolean suaPhong(Phong p) {
        boolean kq = true;
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
           session.update(p);
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
     
     public boolean xoaPhong(Phong p) {
        boolean kq = true;
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
           session.update(p);
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
     
     public boolean traPhong(int maphong) {
        boolean kq = true;
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Update Phong set TinhTrang ='Trống' where Maphong =" +maphong;
            SQLQuery q = session.createSQLQuery(sql);
            int result = q.executeUpdate();
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
     
     public boolean thuePhong(int maphong) {
        boolean kq = true;
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Update Phong set TinhTrang ='Thuê' where Maphong =" +maphong;
            SQLQuery q = session.createSQLQuery(sql);
            int result = q.executeUpdate();
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
