package bai_tap_qlsv_ver1_lop_doi_tuong;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinhVien sinhVienA=new SinhVien();
		sinhVienA.nhapThongTin();
		sinhVienA.xuatThongTin();
		sinhVienA.tinhDiemTrungBinh();
		System.out.println("Diem trung binh la: "+sinhVienA.getDiemTrungBinh());
		sinhVienA.xuLyXepLoai();
		System.out.println("Sinh vien A xep loai: "+sinhVienA.getXepLoai());
	}

}
