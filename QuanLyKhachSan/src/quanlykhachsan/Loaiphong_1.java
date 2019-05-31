/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Phung
 */
@Entity
@Table(name = "loaiphong", catalog = "quanlykhachsan", schema = "")
@NamedQueries({
    @NamedQuery(name = "Loaiphong_1.findAll", query = "SELECT l FROM Loaiphong_1 l")
    , @NamedQuery(name = "Loaiphong_1.findByMaLoai", query = "SELECT l FROM Loaiphong_1 l WHERE l.maLoai = :maLoai")
    , @NamedQuery(name = "Loaiphong_1.findByTenLoai", query = "SELECT l FROM Loaiphong_1 l WHERE l.tenLoai = :tenLoai")
    , @NamedQuery(name = "Loaiphong_1.findByDonGia", query = "SELECT l FROM Loaiphong_1 l WHERE l.donGia = :donGia")})
public class Loaiphong_1 implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "MaLoai")
    private Integer maLoai;
    @Column(name = "TenLoai")
    private String tenLoai;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DonGia")
    private Float donGia;

    public Loaiphong_1() {
    }

    public Loaiphong_1(Integer maLoai) {
        this.maLoai = maLoai;
    }

    public Integer getMaLoai() {
        return maLoai;
    }

    public void setMaLoai(Integer maLoai) {
        Integer oldMaLoai = this.maLoai;
        this.maLoai = maLoai;
        changeSupport.firePropertyChange("maLoai", oldMaLoai, maLoai);
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        String oldTenLoai = this.tenLoai;
        this.tenLoai = tenLoai;
        changeSupport.firePropertyChange("tenLoai", oldTenLoai, tenLoai);
    }

    public Float getDonGia() {
        return donGia;
    }

    public void setDonGia(Float donGia) {
        Float oldDonGia = this.donGia;
        this.donGia = donGia;
        changeSupport.firePropertyChange("donGia", oldDonGia, donGia);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maLoai != null ? maLoai.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Loaiphong_1)) {
            return false;
        }
        Loaiphong_1 other = (Loaiphong_1) object;
        if ((this.maLoai == null && other.maLoai != null) || (this.maLoai != null && !this.maLoai.equals(other.maLoai))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "quanlykhachsan.Loaiphong_1[ maLoai=" + maLoai + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
