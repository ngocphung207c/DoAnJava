/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Phung
 */
public class LoaiPhongDao {
    Session session = null;
    List<Loaiphong> lphongList;
    public LoaiPhongDao() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
    @SuppressWarnings("unchecked")
    public List<Loaiphong> getLoaiPhongList() {
        lphongList = new ArrayList<Loaiphong>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Loaiphong");
            lphongList = (List<Loaiphong>) q.list();
            tx.commit();
        } catch (Exception e) {
            lphongList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
           // session.close();
        }
        return lphongList;
    }
    
    public Loaiphong TonTai(int MaLoaiPhong)
    {
        Loaiphong lp = null;
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Loaiphong where MaLoai =" + MaLoaiPhong);
            lp = (Loaiphong) q.uniqueResult();
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
