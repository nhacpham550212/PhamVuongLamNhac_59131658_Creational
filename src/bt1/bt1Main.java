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
public class bt1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HoaDon hoaDon = new HoaDon();
        hoaDon.setHoaDonHeader(new HoaDonHeader.Builder()
        .addmaHD("A1")
        .addngayBan("11/11/2011")
        .addtenKH("KH1")
        .build());
        hoaDon.addlist(new CTHD.Builder()
        .addSP("Chuoi")
        .addSL(5)
        .addDGia(500)
        .addCK("10%")
        .build());
        System.out.println(hoaDon.toString());
    }
    
}
