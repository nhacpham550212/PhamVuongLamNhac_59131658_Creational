/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author Administrator
 */
public class bt3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Shape shape = ShapeFactory.createShape(ShapeType.Circle);
        System.out.println(shape.draw());
        
    }
    
}
