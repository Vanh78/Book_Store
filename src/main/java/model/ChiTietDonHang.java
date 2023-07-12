package model;

public class ChiTietDonHang {
	
	private String maChiTietDonHangString;
	private DonHang donHang;
	private SanPham sanPham;
	private double soLuong;
	private double giaGoc;
	private double giamGia;
	private double giaban;
	private double thueVAT;
	private double tongTien;
	
	
	public ChiTietDonHang() {
		
	}


	public ChiTietDonHang(String maChiTietDonHangString, DonHang donHang, SanPham sanPham, double soLuong,
			double giaGoc, double giamGia, double giaban, double thueVAT, double tongTien) {	
		this.maChiTietDonHangString = maChiTietDonHangString;
		this.donHang = donHang;
		this.sanPham = sanPham;
		this.soLuong = soLuong;
		this.giaGoc = giaGoc;
		this.giamGia = giamGia;
		this.giaban = giaban;
		this.thueVAT = thueVAT;
		this.tongTien = tongTien;
	}


	public String getMaChiTietDonHangString() {
		return maChiTietDonHangString;
	}


	public void setMaChiTietDonHangString(String maChiTietDonHangString) {
		this.maChiTietDonHangString = maChiTietDonHangString;
	}


	public DonHang getDonHang() {
		return donHang;
	}


	public void setDonHang(DonHang donHang) {
		this.donHang = donHang;
	}


	public SanPham getSanPham() {
		return sanPham;
	}


	public void setSanPham(SanPham sanPham) {
		this.sanPham = sanPham;
	}


	public double getSoLuong() {
		return soLuong;
	}


	public void setSoLuong(double soLuong) {
		this.soLuong = soLuong;
	}


	public double getGiaGoc() {
		return giaGoc;
	}


	public void setGiaGoc(double giaGoc) {
		this.giaGoc = giaGoc;
	}


	public double getGiamGia() {
		return giamGia;
	}


	public void setGiamGia(double giamGia) {
		this.giamGia = giamGia;
	}


	public double getGiaban() {
		return giaban;
	}


	public void setGiaban(double giaban) {
		this.giaban = giaban;
	}


	public double getThueVAT() {
		return thueVAT;
	}


	public void setThueVAT(double thueVAT) {
		this.thueVAT = thueVAT;
	}


	public double getTongTien() {
		return tongTien;
	}


	public void setTongTien(double tongTien) {
		this.tongTien = tongTien;
	}
	
	

}
