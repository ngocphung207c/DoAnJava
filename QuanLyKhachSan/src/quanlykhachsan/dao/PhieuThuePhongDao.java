/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan.dao;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.type.DoubleType;
import org.hibernate.type.LongType;
import org.hibernate.type.StringType;
import quanlykhachsan.entity.HibernateUtil;
import quanlykhachsan.entity.*;

/**
 *
 * @author Phung
 */
public class PhieuThuePhongDao {
     Session session = null;
    List<Phieuthuephong> pList;
    public PhieuThuePhongDao() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
    
    @SuppressWarnings("unchecked")
    public List<Object[]> getThuePhongList() {
        List<Object[]> pthueList = new ArrayList<Object[]>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "select ph.Maphieuthue, p.Tenphong, kh.TenKhachHang, kh.CMND, ph.NgayThue, ph.TongTien from Phong p, Phieuthuephong ph, Phieuthuekhachhang kh "
                    + "where p.Maphong = ph.Maphong and ph.Xoa = false and kh.Xoa = false " 
                    + "and kh.Maphieuthue = ph.Maphieuthue group by p.TenPhong order by kh.ID, ph.Maphieuthue DESC";
            SQLQuery q = session.createSQLQuery(sql);
            pthueList = (List<Object[]>) q.list();
            tx.commit();
        } catch (Exception e) {
            pthueList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
            //session.close();
        }
        return pthueList;
    }
    
    @SuppressWarnings("unchecked")
    public List<Object[]> timThuePhongList(String tenph) {
        List<Object[]> pthueList = new ArrayList<Object[]>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "select ph.Maphieuthue, p.Tenphong, kh.TenKhachHang, kh.CMND, ph.NgayThue, ph.TongTien from Phong p, Phieuthuephong ph, Phieuthuekhachhang kh "
                    + "where p.Maphong = ph.Maphong and ph.Xoa = false and kh.Xoa = false " 
                    + "and kh.Maphieuthue = ph.Maphieuthue and p.Tenphong ='"+ tenph +"' order by kh.ID, ph.Maphieuthue DESC";
            SQLQuery q = session.createSQLQuery(sql);
            pthueList = (List<Object[]>) q.list();
            tx.commit();
        } catch (Exception e) {
            pthueList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
            //session.close();
        }
        return pthueList;
    }
    
    @SuppressWarnings("unchecked")
    public List<Object[]> timThuePhongList(String tenph, String CMND) {
        List<Object[]> pthueList = new ArrayList<Object[]>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select ph.Maphieuthue, p.Tenphong, kh.TenKhachHang, kh.CMND, ph.NgayThue, ph.TongTien from Phong p, Phieuthuephong ph, Phieuthuekhachhang kh "
                    + "where p.Maphong = ph.Maphong and ph.Xoa = false and kh.Xoa = false " 
                    + "and kh.Maphieuthue = ph.Maphieuthue and p.Tenphong ='" + tenph +"' and kh.CMND = '"+ CMND+"' order by kh.ID, ph.Maphieuthue DESC";
            SQLQuery q = session.createSQLQuery(sql);
            pthueList = (List<Object[]>) q.list();
            tx.commit();
        } catch (Exception e) {
            pthueList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
            //session.close();
        }
        return pthueList;
    }
    
    public List<Object[]> timThuePhongListByCMND(String CMND) {
        List<Object[]> pthueList = new ArrayList<Object[]>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Select ph.Maphieuthue, p.Tenphong, kh.TenKhachHang, kh.CMND, ph.NgayThue, ph.TongTien from Phong p, Phieuthuephong ph, Phieuthuekhachhang kh "
                    + "where p.Maphong = ph.Maphong and ph.Xoa = false and kh.Xoa = false " 
                    + "and kh.Maphieuthue = ph.Maphieuthue and kh.CMND = '"+ CMND +"' order by kh.ID, ph.Maphieuthue DESC";
            SQLQuery q = session.createSQLQuery(sql);
            pthueList = (List<Object[]>) q.list();
            tx.commit();
        } catch (Exception e) {
            pthueList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
            //session.close();
        }
        return pthueList;
    }
    
    @SuppressWarnings("unchecked")
    public List<Object[]> timChiTietThuePhongList(int MaPhieu) {
        List<Object[]> pthueList = new ArrayList<Object[]>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "select ph.MaPhong, ph.MaPhieuThue, kh.TenKhachHang, kh.DiaChi, ph.TongTien from Phieuthuephong ph, Phieuthuekhachhang kh "
                    + "where ph.Xoa = false and kh.Xoa = false " 
                    + "and kh.Maphieuthue = ph.Maphieuthue and ph.MaPhieuThue = "+ MaPhieu +" order by kh.ID DESC";
            SQLQuery q = session.createSQLQuery(sql);
            pthueList = (List<Object[]>) q.list();
            tx.commit();
        } catch (Exception e) {
            pthueList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
            //session.close();
        }
        return pthueList;
    }
    
    public boolean traPhong(int MaPhieu) {
        boolean kq = true;
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Update Phieuthuephong set Xoa = true where MaPhieuThue = "+ MaPhieu;
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
    
    public int themPhong(Phieuthuephong p) {
        int id = 0;
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
           
            id = (int) session.save(p);
            tx.commit();
        } catch (Exception e) {
            id = 0;
            tx.rollback();
            e.printStackTrace();
        }finally {
            //session.close();
        }
        return id;
    }
     public boolean suaPhong(Phieuthuephong p) {
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
     
     public boolean xoaPhong(Phieuthuephong p) {
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
     
     public boolean tinhTien(float tongtien, int MaPhieu) {
        boolean kq = true;
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            String sql = "Update Phieuthuephong set TongTien ="+tongtien+ " where MaPhieuThue = "+ MaPhieu;
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
