package quanlykhachsan;
// Generated May 30, 2019 12:16:59 AM by Hibernate Tools 4.3.1



/**
 * Phong generated by hbm2java
 */
public class Phong  implements java.io.Serializable {


     private int maPhong;
     private String tenPhong;
     private String ghiChu;
     private Boolean tinhTrang;
     private String maLoai;

    public Phong() {
    }

	
    public Phong(int maPhong) {
        this.maPhong = maPhong;
    }
    public Phong(int maPhong, String tenPhong, String ghiChu, Boolean tinhTrang, String maLoai) {
       this.maPhong = maPhong;
       this.tenPhong = tenPhong;
       this.ghiChu = ghiChu;
       this.tinhTrang = tinhTrang;
       this.maLoai = maLoai;
    }
   
    public int getMaPhong() {
        return this.maPhong;
    }
    
    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }
    public String getTenPhong() {
        return this.tenPhong;
    }
    
    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }
    public String getGhiChu() {
        return this.ghiChu;
    }
    
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    public Boolean getTinhTrang() {
        return this.tinhTrang;
    }
    
    public void setTinhTrang(Boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public String getMaLoai() {
        return this.maLoai;
    }
    
    public void setMaLoai(String maLoai) {
        this.maLoai = maLoai;
    }




}


