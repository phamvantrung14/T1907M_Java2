package LapS6;

public class Product {
    private int id;
    private String tenSp;
    private String moTa;
    private int gia;
    private int soLuong;

    public Product() {
    }

    public Product(int id,String tenSp, String moTa, int gia, int soLuong) {
        this.id = id;
        this.tenSp = tenSp;
        this.moTa = moTa;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
