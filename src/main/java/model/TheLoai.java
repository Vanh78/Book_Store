package model;

public class TheLoai {
	private String maTheLoaiString;
	private String tenTheloaiString;
	
	
	public TheLoai() {
	
	}
	public TheLoai(String maTheLoaiString, String tenTheloaiString) {	
		this.maTheLoaiString = maTheLoaiString;
		this.tenTheloaiString = tenTheloaiString;
	}
	public String getMaTheLoaiString() {
		return maTheLoaiString;
	}
	public void setMaTheLoaiString(String maTheLoaiString) {
		this.maTheLoaiString = maTheLoaiString;
	}
	public String getTenTheloaiString() {
		return tenTheloaiString;
	}
	public void setTenTheloaiString(String tenTheloaiString) {
		this.tenTheloaiString = tenTheloaiString;
	}
	
	
}
