package entity;

public class Phongban {
    private String maPhong;
    private String tenPhong;
    private String soDT;

    public Phongban(String maPhong, String tenPhong, String soDT) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.soDT = soDT;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    @Override
    public String toString() {
        return "Phongban{" + "maPhong=" + maPhong + ", tenPhong=" + tenPhong + ", soDT=" + soDT + '}';
    }
    
    
}
