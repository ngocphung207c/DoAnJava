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
}
