package bai2_canbo;

public class CanBo_121 {
    protected String hoTen_121;
    protected String ngaySinh_121;
    protected String gioiTinh_121;
    protected String diaChi_121;

    public CanBo_121(String hoTen_121, String ngaySinh_121, String gioiTinh_121, String diaChi_121) {
        this.hoTen_121 = hoTen_121;
        this.ngaySinh_121 = ngaySinh_121;
        this.gioiTinh_121 = gioiTinh_121;
        this.diaChi_121 = diaChi_121;
    }

    public String getHoTen() { return hoTen_121; }
    public void setHoTen(String hoTen_121) { this.hoTen_121 = hoTen_121; }

    public String hienThi() {
        return "Ho ten: " + hoTen_121 + "\nNgay sinh: " + ngaySinh_121 +
               "\nGioi tinh: " + gioiTinh_121 + "\nDia chi: " + diaChi_121;
    }
}
