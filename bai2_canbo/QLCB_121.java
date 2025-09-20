package bai2_canbo;

import java.util.ArrayList;

public class QLCB_121 {
    private ArrayList<CanBo_121> danhSach_121;

    public QLCB_121() {
        danhSach_121 = new ArrayList<>();
    }

    public void themCanBo(CanBo_121 cb) {
        danhSach_121.add(cb);
    }

    public ArrayList<CanBo_121> timKiemTheoTen(String ten) {
        ArrayList<CanBo_121> kq = new ArrayList<>();
        for (CanBo_121 cb : danhSach_121) {
            if (cb.getHoTen().equalsIgnoreCase(ten)) {
                kq.add(cb);
            }
        }
        return kq;
    }

    public ArrayList<CanBo_121> getDanhSach() {
        return danhSach_121;
    }
}
