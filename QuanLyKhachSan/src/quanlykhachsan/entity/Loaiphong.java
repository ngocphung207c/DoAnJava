package quanlykhachsan.entity;
// Generated Jun 13, 2019 4:36:06 PM by Hibernate Tools 4.3.1



/**
 * Loaiphong generated by hbm2java
 */
public class Loaiphong  implements java.io.Serializable {


     private Integer maLoai;
     private String tenLoai;
     private Float donGia;
     private Boolean xoa;

    public Loaiphong() {
    }

    public Loaiphong(String tenLoai, Float donGia, Boolean xoa) {
       this.tenLoai = tenLoai;
       this.donGia = donGia;
       this.xoa = xoa;
    }
   
    public Integer getMaLoai() {
        return this.maLoai;
    }
    
    public void setMaLoai(Integer maLoai) {
        this.maLoai = maLoai;
    }
    public String getTenLoai() {
        return this.tenLoai;
    }
    
    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
    public Float getDonGia() {
        return this.donGia;
    }
    
    public void setDonGia(Float donGia) {
        this.donGia = donGia;
    }
    public Boolean getXoa() {
        return this.xoa;
    }
    
    public void setXoa(Boolean xoa) {
        this.xoa = xoa;
    }

@Override
    public String toString()
    {
        return this.tenLoai;
    }


}


