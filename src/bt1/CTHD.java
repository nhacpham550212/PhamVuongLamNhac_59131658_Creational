/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author Administrator
 */
public class CTHD {
    String sanPham,chietKhau;
    int soLuong,donGia;

    public CTHD(Builder builder) {
        this.sanPham =builder.sanPham;
        this.chietKhau =builder.chietKhau;
        this.soLuong = builder.soLuong;
        this.donGia = builder.donGia;
    }
    
    
    @Override
    public String toString() {
        return "CTHD{" + "sanPham=" + sanPham + ", chietKhau=" + chietKhau + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
     public static class Builder
    {

        String sanPham,chietKhau;
        int soLuong,donGia;
        public Builder()
        {
            
        }
        public Builder addSP(String sanPham)
        {
            this.sanPham=sanPham;
            return this;
        }
         public Builder addSL(int soLuong)
        {
            this.soLuong=soLuong;
            return this;
        }
         public Builder addDGia(int donGia)
        {
            this.donGia=donGia;
            return this;
        }
         public Builder addCK(String chietKhau)
        {
            this.chietKhau=chietKhau;
            return this;
        }
        
        public CTHD build()
        {
            return new CTHD(this);
        }
        
    }
}
