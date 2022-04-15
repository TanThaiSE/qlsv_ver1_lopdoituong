package bai_tap_qlsv_ver1_lop_doi_tuong;

import java.util.Scanner;

public class SinhVien {
	private String hoTen;
	private String mssv;
	private String gioiTinh;
	private double toan;
	private double ly;
	private double hoa;
	private double diemTrungBinh;
	private String xepLoai;
	
	public void tinhDiemTrungBinh() {
		diemTrungBinh=(toan+ly+hoa)*1.0/3;
	}
	public void xuLyXepLoai() {
		/*Diem trung binh x
		 * 9<=x<=10: hoc sinh gioi
		 * 7<=x<=8: hoc sinh kha
		 * 5<=x<=6 : hoc sinh trung binh
		 * <5: hoc sinh yeu
		 * */
		if(9<=diemTrungBinh&&diemTrungBinh<=10) {
			xepLoai= "Hoc sinh gioi";
		}
		else if(7<=diemTrungBinh&&diemTrungBinh<=8) {
			xepLoai= "Hoc sinh kha";
		}
		else if(5<=diemTrungBinh&&diemTrungBinh<=6) {
			xepLoai= "Hoc sinh trung binh";
		}
		else if(0<=diemTrungBinh&&diemTrungBinh<5) {
			xepLoai= "Hoc sinh yeu";
		}
		else {
			xepLoai="Khong thay";
		}
	}
	
	public void nhapThongTin() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ho ten");
		hoTen=sc.nextLine();
		System.out.println("Nhap mssv");
		mssv=sc.nextLine();
		System.out.println("Nhap gioi tinh");
		gioiTinh=sc.nextLine();
		System.out.println("Nhap diem toan");
		toan=sc.nextDouble();
		System.out.println("Nhap diem ly");
		ly=sc.nextDouble();
		System.out.println("Nhap diem hoa");
		hoa=sc.nextDouble();
	}
	public void xuatThongTin() {
		System.out.println( "SinhVien [hoTen=" + hoTen + ", mssv=" + mssv + ", gioiTinh=" + gioiTinh + ", toan=" + toan + ", ly="
				+ ly + ", hoa=" + hoa);
	}

	public SinhVien(String hoTen, String mssv, String gioiTinh, double toan, double ly, double hoa) {
		this.hoTen = hoTen;
		this.mssv = mssv;
		this.gioiTinh = gioiTinh;
		this.toan = toan;
		this.ly = ly;
		this.hoa = hoa;

	}
	public SinhVien() {
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public double getToan() {
		return toan;
	}
	public void setToan(double toan) {
		this.toan = toan;
	}
	public double getLy() {
		return ly;
	}
	public void setLy(double ly) {
		this.ly = ly;
	}
	public double getHoa() {
		return hoa;
	}
	public void setHoa(double hoa) {
		this.hoa = hoa;
	}
	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public String getXepLoai() {
		return xepLoai;
	}
	
}
