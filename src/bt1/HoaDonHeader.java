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
public class HoaDonHeader {
        String maHD,ngayBan,tenKH;
               
    public HoaDonHeader(Builder builder) {
        this.maHD =builder.maHD;
        this.ngayBan =builder.ngayBan;
        this.tenKH =builder.tenKH;
    }
    @Override
    public String toString() {
        return "HoaDonHeader{" + "maHD=" + maHD + ", ngayBan=" + ngayBan + ", tenKH=" + tenKH + '}';
    }
 
    public static class Builder
    {

        String maHD,ngayBan,tenKH;
        public Builder()
        {
            
        }
        public Builder addmaHD(String maHD)
        {
            this.maHD=maHD;
            return this;
        }
         public Builder addngayBan(String ngayBan)
        {
            this.ngayBan=ngayBan;
            return this;
        }
          public Builder addtenKH(String tenKH)
        {
            this.tenKH=tenKH;
            return this;
        }
         
        
        public HoaDonHeader build()
        {
            return new HoaDonHeader(this);
        }
    }
}