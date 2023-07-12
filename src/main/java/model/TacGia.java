package model;

import java.sql.Date;
import java.util.Objects;

public class TacGia {
	private String maTacgiaString;
	private String hoVaTenString;
	private Date ngaySing;
	private String tieuSuString;
	
	public TacGia() {
		
	}

	public TacGia(String maTacgiaString, String hoVaTenString, Date ngaySing, String tieuSuString) {
		this.maTacgiaString = maTacgiaString;
		this.hoVaTenString = hoVaTenString;
		this.ngaySing = ngaySing;
		this.tieuSuString = tieuSuString;
	}

	public String getMaTacgiaString() {
		return maTacgiaString;
	}

	public void setMaTacgiaString(String maTacgiaString) {
		this.maTacgiaString = maTacgiaString;
	}

	public String getHoVaTenString() {
		return hoVaTenString;
	}

	public void setHoVaTenString(String hoVaTenString) {
		this.hoVaTenString = hoVaTenString;
	}

	public Date getNgaySing() {
		return ngaySing;
	}

	public void setNgaySing(Date ngaySing) {
		this.ngaySing = ngaySing;
	}

	public String getTieuSuString() {
		return tieuSuString;
	}

	public void setTieuSuString(String tieuSuString) {
		this.tieuSuString = tieuSuString;
	}

	@Override
	public int hashCode() {
		return Objects.hash(hoVaTenString, maTacgiaString, ngaySing, tieuSuString);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TacGia other = (TacGia) obj;
		return Objects.equals(maTacgiaString, other.maTacgiaString) ;
	}

	@Override
	public String toString() {
		return "TacGia [maTacgiaString=" + maTacgiaString + ", hoVaTenString=" + hoVaTenString + ", ngaySing="
				+ ngaySing + ", tieuSuString=" + tieuSuString + "]";
	}
	
	

	
	
	

}
