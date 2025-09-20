package bai2_canbo;

public class CongNhan_121 extends CanBo_121 {
    private String bac_121;

    public CongNhan_121(String hoTen_121, String ngaySinh_121, String gioiTinh_121, String diaChi_121, String bac_121) {
        super(hoTen_121, ngaySinh_121, gioiTinh_121, diaChi_121);
        this.bac_121 = bac_121;
    }

    @Override
    public String hienThi() {
        return super.hienThi() + "\nBac cong nhan: " + bac_121;
    }
}
