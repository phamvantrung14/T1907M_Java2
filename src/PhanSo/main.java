package PhanSo;

public class main {
    public static void main(String[] args){
        phanSo ps = new phanSo();
        phanSo ps2 = new phanSo(10,5);
        ps.NhapPhanSo();
        ps.InPhanSo();
        ps.toiGianPhanSo();

        ps.congPhanSo(ps2);
        ps.nhanPhanSo(ps2);
        ps.truPhanSo(ps2);
        ps.chiaPhanSo(ps2);

    }
}
