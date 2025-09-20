package bai2_canbo;

public class NhanVien_121 extends CanBo_121 {
    private String congViec_121;

    public NhanVien_121(String hoTen_121, String ngaySinh_121, String gioiTinh_121, String diaChi_121, String congViec_121) {
        super(hoTen_121, ngaySinh_121, gioiTinh_121, diaChi_121);
        this.congViec_121 = congViec_121;
    }

    @Override
    public String hienThi() {
        return super.hienThi() + "\nCong viec: " + congViec_121;
    }
}
