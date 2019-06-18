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
public class PhieuThueKhachHangDao {
     Session session = null;
    List<Phieuthuekhachhang> pList;
    public PhieuThueKhachHangDao() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
    public boolean themKH(Phieuthuekhachhang p) {
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
