package quanlykhachsan.entity;
// Generated Jun 13, 2019 4:36:06 PM by Hibernate Tools 4.3.1



/**
 * Phieuthuekhachhang generated by hbm2java
 */
public class Phieuthuekhachhang  implements java.io.Serializable {


     private Integer id;
     private Integer maPhieuThue;
     private String tenKhachHang;
     private Integer loaiKhach;
     private String cmnd;
     private String diaChi;
     private Boolean xoa;

    public Phieuthuekhachhang() {
    }

    public Phieuthuekhachhang(Integer maPhieuThue, String tenKhachHang, Integer loaiKhach, String cmnd, String diaChi, Boolean xoa) {
       this.maPhieuThue = maPhieuThue;
       this.tenKhachHang = tenKhachHang;
       this.loaiKhach = loaiKhach;
       this.cmnd = cmnd;
       this.diaChi = diaChi;
       this.xoa = xoa;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getMaPhieuThue() {
        return this.maPhieuThue;
    }
    
    public void setMaPhieuThue(Integer maPhieuThue) {
        this.maPhieuThue = maPhieuThue;
    }
    public String getTenKhachHang() {
        return this.tenKhachHang;
    }
    
    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
    public Integer getLoaiKhach() {
        return this.loaiKhach;
    }
    
    public void setLoaiKhach(Integer loaiKhach) {
        this.loaiKhach = loaiKhach;
    }
    public String getCmnd() {
        return this.cmnd;
    }
    
    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
    public String getDiaChi() {
        return this.diaChi;
    }
    
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public Boolean getXoa() {
        return this.xoa;
    }
    
    public void setXoa(Boolean xoa) {
        this.xoa = xoa;
    }




}


