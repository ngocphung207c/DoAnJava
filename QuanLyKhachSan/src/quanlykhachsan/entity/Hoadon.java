package quanlykhachsan;
// Generated May 31, 2019 5:03:23 PM by Hibernate Tools 4.3.1



/**
 * Hoadon generated by hbm2java
 */
public class Hoadon  implements java.io.Serializable {


     private int maHd;
     private String tenKhachHang;
     private String diaChi;
     private Float triGia;

    public Hoadon() {
    }

	
    public Hoadon(int maHd) {
        this.maHd = maHd;
    }
    public Hoadon(int maHd, String tenKhachHang, String diaChi, Float triGia) {
       this.maHd = maHd;
       this.tenKhachHang = tenKhachHang;
       this.diaChi = diaChi;
       this.triGia = triGia;
    }
   
    public int getMaHd() {
        return this.maHd;
    }
    
    public void setMaHd(int maHd) {
        this.maHd = maHd;
    }
    public String getTenKhachHang() {
        return this.tenKhachHang;
    }
    
    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }
    public String getDiaChi() {
        return this.diaChi;
    }
    
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public Float getTriGia() {
        return this.triGia;
    }
    
    public void setTriGia(Float triGia) {
        this.triGia = triGia;
    }




}

