package bai2_canbo;

public class KySu_121 extends CanBo_121 {
    private String nganhDaoTao_121;

    public KySu_121(String hoTen_121, String ngaySinh_121, String gioiTinh_121, String diaChi_121, String nganhDaoTao_121) {
        super(hoTen_121, ngaySinh_121, gioiTinh_121, diaChi_121);
        this.nganhDaoTao_121 = nganhDaoTao_121;
    }

    @Override
    public String hienThi() {
        return super.hienThi() + "\nNganh dao tao: " + nganhDaoTao_121;
    }
}
