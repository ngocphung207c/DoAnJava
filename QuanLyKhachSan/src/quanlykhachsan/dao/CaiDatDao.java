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
public class CaiDatDao {
    Session session = null;
    List<Caidat> caiDatList;
    public CaiDatDao() {
        this.session = HibernateUtil.getSessionFactory().openSession();
    }
     @SuppressWarnings("unchecked")
    public Caidat getCaiDat() {
        caiDatList = new ArrayList<Caidat>();
        org.hibernate.Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query q = session.createQuery("from Caidat ORDER BY ID desc");
            caiDatList = (List<Caidat>) q.list();
            tx.commit();
        } catch (Exception e) {
            caiDatList = null;
            tx.rollback();
            e.printStackTrace();
        }finally {
           // session.close();
        }
        return caiDatList.get(0);
    }
    
     public boolean themCaiDat(Caidat p) {
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
