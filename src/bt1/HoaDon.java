/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;


/**
 *
 * @author Administrator
 */
public class HoaDon {
    HoaDonHeader hoaDonHeader;
   ArrayList<CTHD> listcthd = new ArrayList<>();

    public HoaDon() {
    }

   
    public HoaDon(HoaDonHeader hoaDonHeader) {
        this.hoaDonHeader = hoaDonHeader;
    }

    public HoaDonHeader getHoaDonHeader() {
        return hoaDonHeader;
    }

    public void setHoaDonHeader(HoaDonHeader hoaDonHeader) {
        this.hoaDonHeader = hoaDonHeader;
    }

    
    
   public void addlist(CTHD cthd)
   {
       listcthd.add(cthd);
   }

    @Override
    public String toString() {
        return "\nHóa Đơn Header: " + hoaDonHeader.toString()+
                 "\nCTHD:\n" + listcthd.toString();
    }

    
    

   
}
