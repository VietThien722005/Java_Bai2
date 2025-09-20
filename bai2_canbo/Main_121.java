package bai2_canbo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Main_121 extends JFrame {
    private QLCB_121 qlcb_121 = new QLCB_121();
    private JTextArea textArea_121;
    private JTextField txtTen_121, txtNgaySinh_121, txtGioiTinh_121, txtDiaChi_121, txtPhu_121;
    private JComboBox<String> cboLoai_121;

    public Main_121() {
        setTitle("Quan Ly Can Bo 121");
        setSize(500, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        textArea_121 = new JTextArea();
        textArea_121.setEditable(false);
        add(new JScrollPane(textArea_121), BorderLayout.CENTER);

        JPanel nhapPanel = new JPanel(new GridLayout(7, 2));
        nhapPanel.add(new JLabel("Ho ten:"));
        txtTen_121 = new JTextField();
        nhapPanel.add(txtTen_121);

        nhapPanel.add(new JLabel("Ngay sinh:"));
        txtNgaySinh_121 = new JTextField();
        nhapPanel.add(txtNgaySinh_121);

        nhapPanel.add(new JLabel("Gioi tinh:"));
        txtGioiTinh_121 = new JTextField();
        nhapPanel.add(txtGioiTinh_121);

        nhapPanel.add(new JLabel("Dia chi:"));
        txtDiaChi_121 = new JTextField();
        nhapPanel.add(txtDiaChi_121);

        nhapPanel.add(new JLabel("Loai can bo:"));
        cboLoai_121 = new JComboBox<>(new String[]{"Cong nhan", "Ky su", "Nhan vien"});
        nhapPanel.add(cboLoai_121);

        nhapPanel.add(new JLabel("Thong tin phu:"));
        txtPhu_121 = new JTextField();
        nhapPanel.add(txtPhu_121);

        JButton btnThem_121 = new JButton("Them can bo");
        JButton btnHienThi_121 = new JButton("Hien thi tat ca");
        nhapPanel.add(btnThem_121);
        nhapPanel.add(btnHienThi_121);

        add(nhapPanel, BorderLayout.NORTH);

        btnThem_121.addActionListener(e -> {
            String ten = txtTen_121.getText().trim();
            String ns = txtNgaySinh_121.getText().trim();
            String gt = txtGioiTinh_121.getText().trim();
            String dc = txtDiaChi_121.getText().trim();
            String phu = txtPhu_121.getText().trim();
            String loai = (String) cboLoai_121.getSelectedItem();

            if (loai.equals("Cong nhan")) {
                qlcb_121.themCanBo(new CongNhan_121(ten, ns, gt, dc, phu));
            } else if (loai.equals("Ky su")) {
                qlcb_121.themCanBo(new KySu_121(ten, ns, gt, dc, phu));
            } else {
                qlcb_121.themCanBo(new NhanVien_121(ten, ns, gt, dc, phu));
            }

            textArea_121.setText("Da them can bo!\n");
        });

        btnHienThi_121.addActionListener(e -> {
            textArea_121.setText("Danh sach can bo:\n");
            for (CanBo_121 cb : qlcb_121.getDanhSach()) {
                textArea_121.append(cb.hienThi() + "\n-----------------\n");
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Main_121().setVisible(true));
    }
}
