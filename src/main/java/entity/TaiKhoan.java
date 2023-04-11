package entity;

public class TaiKhoan {
	private String maTaiKhoan;
	private String tenDangNhap;
	private String matKhau;
	private String QuyenHan;

	public TaiKhoan() {
	}

	public TaiKhoan(String maTaiKhoan, String tenDangNhap, String matKhau, String QuyenHan) {
		this.maTaiKhoan = maTaiKhoan;
		this.tenDangNhap = tenDangNhap;
		this.matKhau = matKhau;
		this.QuyenHan = QuyenHan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

	public String getTenDangNhap() {
		return tenDangNhap;
	}

	public void setTenDangNhap(String tenDangNhap) {
		this.tenDangNhap = tenDangNhap;
	}

	public String getQuyenHan() {
		return QuyenHan;
	}

	public void setQuyenHan(String QuyenHan) {
		this.QuyenHan = QuyenHan;
	}

	public String getMaTaiKhoan() {
		return maTaiKhoan;
	}

	public void setMaTaiKhoan(String maTaiKhoan) {
		this.maTaiKhoan = maTaiKhoan;
	}

	@Override
	public String toString() {
		return "TaiKhoan [maTaiKhoan=" + maTaiKhoan + ", tenDangNhap=" + tenDangNhap + ", matKhau=" + matKhau
				+ ", QuyenHan=" + QuyenHan + "]";
	}

}
