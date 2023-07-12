package model;

import java.sql.Date;
import java.util.Objects;

public class DonHang {
	private String maDonhangString;
	private KhachHang khachHang;
	private String diaChiMuaHangString;
	private String diaChiNhanHangString;
	private String trangThaiString;
	private String hinhThucThanhToanString;
	private String trangThaiThanhToanString;
	private double soTienDaThanhToan;
	private double soTienConThieu;
	private Date ngayDatHangDate;
	private Date ngayGiaoHangDate;
	
	
	
	public DonHang() {

	}



	public DonHang(String maDonhangString, KhachHang khachHang, String diaChiMuaHangString, String diaChiNhanHangString,
			String trangThaiString, String hinhThucThanhToanString, String trangThaiThanhToanString,
			double soTienDaThanhToan, double soTienConThieu, Date ngayDatHangDate, Date ngayGiaoHangDate) {
		super();
		this.maDonhangString = maDonhangString;
		this.khachHang = khachHang;
		this.diaChiMuaHangString = diaChiMuaHangString;
		this.diaChiNhanHangString = diaChiNhanHangString;
		this.trangThaiString = trangThaiString;
		this.hinhThucThanhToanString = hinhThucThanhToanString;
		this.trangThaiThanhToanString = trangThaiThanhToanString;
		this.soTienDaThanhToan = soTienDaThanhToan;
		this.soTienConThieu = soTienConThieu;
		this.ngayDatHangDate = ngayDatHangDate;
		this.ngayGiaoHangDate = ngayGiaoHangDate;
	}



	public String getMaDonhangString() {
		return maDonhangString;
	}



	public void setMaDonhangString(String maDonhangString) {
		this.maDonhangString = maDonhangString;
	}



	public KhachHang getKhachHang() {
		return khachHang;
	}



	public void setKhachHang(KhachHang khachHang) {
		this.khachHang = khachHang;
	}



	public String getDiaChiMuaHangString() {
		return diaChiMuaHangString;
	}



	public void setDiaChiMuaHangString(String diaChiMuaHangString) {
		this.diaChiMuaHangString = diaChiMuaHangString;
	}



	public String getDiaChiNhanHangString() {
		return diaChiNhanHangString;
	}



	public void setDiaChiNhanHangString(String diaChiNhanHangString) {
		this.diaChiNhanHangString = diaChiNhanHangString;
	}



	public String getTrangThaiString() {
		return trangThaiString;
	}



	public void setTrangThaiString(String trangThaiString) {
		this.trangThaiString = trangThaiString;
	}



	public String getHinhThucThanhToanString() {
		return hinhThucThanhToanString;
	}



	public void setHinhThucThanhToanString(String hinhThucThanhToanString) {
		this.hinhThucThanhToanString = hinhThucThanhToanString;
	}



	public String getTrangThaiThanhToanString() {
		return trangThaiThanhToanString;
	}



	public void setTrangThaiThanhToanString(String trangThaiThanhToanString) {
		this.trangThaiThanhToanString = trangThaiThanhToanString;
	}



	public double getSoTienDaThanhToan() {
		return soTienDaThanhToan;
	}



	public void setSoTienDaThanhToan(double soTienDaThanhToan) {
		this.soTienDaThanhToan = soTienDaThanhToan;
	}



	public double getSoTienConThieu() {
		return soTienConThieu;
	}



	public void setSoTienConThieu(double soTienConThieu) {
		this.soTienConThieu = soTienConThieu;
	}



	public Date getNgayDatHangDate() {
		return ngayDatHangDate;
	}



	public void setNgayDatHangDate(Date ngayDatHangDate) {
		this.ngayDatHangDate = ngayDatHangDate;
	}



	public Date getNgayGiaoHangDate() {
		return ngayGiaoHangDate;
	}



	public void setNgayGiaoHangDate(Date ngayGiaoHangDate) {
		this.ngayGiaoHangDate = ngayGiaoHangDate;
	}



	@Override
	public int hashCode() {
		return Objects.hash(maDonhangString);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DonHang other = (DonHang) obj;
		return Objects.equals(maDonhangString, other.maDonhangString);
	}



	public double getTienThanhToanString() {
		// TODO Auto-generated method stub
		return 0;
	}



	public String getDiaChiNguoiMuaString() {
		// TODO Auto-generated method stub
		return null;
	}



	public double getTienThieuString() {
		// TODO Auto-generated method stub
		return 0;
	}



	public String getThanhToan() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
	

}
