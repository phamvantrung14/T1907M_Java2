package Lap04;

import java.time.LocalDate;

public class Mobile {
    public  String hangSanXuat;
    public int seri;
    public int namSanXuat;

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getSeri() {
        return seri;
    }

    public void setSeri(int seri) {
        this.seri = seri;
    }

    public int getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(int namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public Mobile(String hangSanXuat, int seri, int namSanXuat) {
        this.hangSanXuat = hangSanXuat;
        this.seri = seri;
        this.namSanXuat = namSanXuat;
    }
    LocalDate spec = LocalDate.of(2017, 11, 25);


    public void checkDate(){
        if (namSanXuat>spec.getYear()){
            System.out.println("het han su dung");
            System.out.println("han su dung la:"+spec);
        }else if (namSanXuat<=spec.getYear()){
            System.out.println("con han su dung");
            System.out.println("han su dung la:"+spec);
        }
    }
    public static void main(String args[]){
        Mobile dt = new Mobile("Nokia",14568799,2020);
        dt.checkDate();

    }
}
