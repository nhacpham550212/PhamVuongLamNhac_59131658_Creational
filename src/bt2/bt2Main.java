/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author Administrator
 */
public class bt2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder myStringBuilder = new MyStringBuilder.Builder()
                .addString("lalala")
                .addFloat(7.5f)
                .addBoolean(true)
                .build();
        System.out.println(myStringBuilder.toString());
    }
    
}
