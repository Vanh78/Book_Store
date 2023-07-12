package model;

import java.sql.Date;

public class KhachHang {
	
	private String maKhachHangString;
	private String tenDangNhapString;
	private String matKhauString;
	private String hoVaTenString;
	private String gioiTinhString;
	private String diaChiString;
	private String diaChiNhanhangString;
	private String diaChiMuaHangString;
	private Date ngaySinh;
	private String soDienThoaiString;
	private String emailString;
	private boolean dangKyNhanBangTin;
	
	
	public KhachHang() {
		 
	}
	
	
	
	public KhachHang(String maKhachHangString, String tenDangNhapString, String matKhauString, String hoVaTenString,
			String gioiTinhString, String diaChiString, String diaChiNhanhangString, String diaChiMuaHangString,
			Date ngaySinh, String soDienThoaiString, String emailString, boolean dangKyNhanBangTin) {
		super();
		this.maKhachHangString = maKhachHangString;
		this.tenDangNhapString = tenDangNhapString;
		this.matKhauString = matKhauString;
		this.hoVaTenString = hoVaTenString;
		this.gioiTinhString = gioiTinhString;
		this.diaChiString = diaChiString;
		this.diaChiNhanhangString = diaChiNhanhangString;
		this.diaChiMuaHangString = diaChiMuaHangString;
		this.ngaySinh = ngaySinh;
		this.soDienThoaiString = soDienThoaiString;
		this.emailString = emailString;
		this.dangKyNhanBangTin = dangKyNhanBangTin;
	}
	
	
	
	public String getMaKhachHangString() {
		return maKhachHangString;
	}
	public void setMaKhachHangString(String maKhachHangString) {
		this.maKhachHangString = maKhachHangString;
	}
	public String getTenDangNhapString() {
		return tenDangNhapString;
	}
	public void setTenDangNhapString(String tenDangNhapString) {
		this.tenDangNhapString = tenDangNhapString;
	}
	public String getMatKhauString() {
		return matKhauString;
	}
	public void setMatKhauString(String matKhauString) {
		this.matKhauString = matKhauString;
	}
	public String getHoVaTenString() {
		return hoVaTenString;
	}
	public void setHoVaTenString(String hoVaTenString) {
		this.hoVaTenString = hoVaTenString;
	}
	public String getGioiTinhString() {
		return gioiTinhString;
	}
	public void setGioiTinhString(String gioiTinhString) {
		this.gioiTinhString = gioiTinhString;
	}
	public String getDiaChiString() {
		return diaChiString;
	}
	public void setDiaChiString(String diaChiString) {
		this.diaChiString = diaChiString;
	}
	public String getDiaChiNhanhangString() {
		return diaChiNhanhangString;
	}
	public void setDiaChiNhanhangString(String diaChiNhanhangString) {
		this.diaChiNhanhangString = diaChiNhanhangString;
	}
	public String getDiaChiMuaHangString() {
		return diaChiMuaHangString;
	}
	public void setDiaChiMuaHangString(String diaChiMuaHangString) {
		this.diaChiMuaHangString = diaChiMuaHangString;
	}
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public String getSoDienThoaiString() {
		return soDienThoaiString;
	}
	public void setSoDienThoaiString(String soDienThoaiString) {
		this.soDienThoaiString = soDienThoaiString;
	}
	public String getEmailString() {
		return emailString;
	}
	public void setEmailString(String emailString) {
		this.emailString = emailString;
	}
	public boolean isDangKyNhanBangTin() {
		return dangKyNhanBangTin;
	}
	public void setDangKyNhanBangTin(boolean dangKyNhanBangTin) {
		this.dangKyNhanBangTin = dangKyNhanBangTin;
	}
	
	

}
