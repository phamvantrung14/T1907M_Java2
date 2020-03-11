package PhanSo;

import java.util.Scanner;

public class phanSo {
    private int tu;
    private  int mau;

    public phanSo() {
    }

    public phanSo(int tu, int mau) {
        this.tu = tu;
        this.mau = mau;
    }

    public int getTu() {
        return tu;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public int getMau() {
        return mau;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }


    public void NhapPhanSo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập tử số: ");
        this.tu = sc.nextInt();
        System.out.println("Mời nhập mẫu số");
        this.mau = sc.nextInt();

    }
    public void InPhanSo(){
        System.out.println("phân số: "+tu+"/"+mau);
    }
    public  int timUSCLN(int a,int b){
        while (a!=b){
            if (a>b){
                a-=b;
            }else {
                b-=a;
            }
        }
        return a;
    }
    public void toiGianPhanSo(){
        int i= timUSCLN(this.getTu(),this.getMau());
        this.setTu(this.getTu()/i);
        this.setMau(this.getMau()/i);
//        System.out.println("phan so sau khi tối giản là:"+tu+"/"+mau);
    }
    public void congPhanSo(phanSo ps){
        int ts = this.getTu()*ps.getMau()+ps.getTu()*this.getMau();
        int ms = this.getMau()*ps.getMau();
        phanSo phanSoTong= new phanSo(ts,ms);
        phanSoTong.toiGianPhanSo();
        System.out.println("Tổng hai phân số = "+ phanSoTong.tu+"/"+phanSoTong.mau);
    }
    public void nhanPhanSo(phanSo ps){
        int ts = this.getTu()*ps.getTu();
        int ms = this.getMau()*ps.getMau();
        phanSo phanSoTich = new phanSo(ts,ms);
        phanSoTich.toiGianPhanSo();
        System.out.println("Tích của hai phân số là: "+ phanSoTich.tu+"/"+phanSoTich.mau);
    }
    public void truPhanSo(phanSo ps){
        int ts = this.getTu() * ps.getMau() - ps.getTu() * this.getMau();
        int ms = this.getMau() * ps.getMau();
        phanSo phanSoHieu = new phanSo(ts,ms);
        phanSoHieu.toiGianPhanSo();
        System.out.println("Hiệu của hai phân số là: "+phanSoHieu.tu+"/"+phanSoHieu.mau);
    }
    public void chiaPhanSo(phanSo ps){
        int ts = this.getTu() * ps.getMau();
        int ms = this.getMau() * ps.getTu();
        phanSo phanSoThuong = new phanSo(ts,ms);
        phanSoThuong.toiGianPhanSo();
        System.out.println("Thương của hai phân số là: "+phanSoThuong.tu+"/"+phanSoThuong.mau);
    }
}
