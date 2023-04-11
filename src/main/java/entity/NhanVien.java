package entity;

import java.util.Date;

/**
 *
 * @author thait
 */
public class NhanVien {

    private String maNV;
    private String hoTenNV;
    private Date ngaysinh;
    private boolean gioitinh;
    private String soCCCD;
    private String diachi;
    private String soDT;
    private float hesoluong;

    public Phongban getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(Phongban phongBan) {
        this.phongBan = phongBan;
    }
    private Phongban phongBan;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getHoTenNV() {
        return hoTenNV;
    }

    public void setHoTenNV(String hoTenNV) {
        this.hoTenNV = hoTenNV;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public boolean isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(boolean gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSoCCCD() {
        return soCCCD;
    }

    public void setSoCCCD(String soCCCD) {
        this.soCCCD = soCCCD;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public float getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(float hesoluong) {
        this.hesoluong = hesoluong;
    }

    public NhanVien() {
    }

    @Override
    public String toString() {
        return "NhanVien{" + "maNV=" + maNV + ", hoTenNV=" + hoTenNV + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", soCCCD=" + soCCCD + ", diachi=" + diachi + ", soDT=" + soDT + ", hesoluong=" + hesoluong + ", phongBan=" + phongBan + '}';
    }
}
