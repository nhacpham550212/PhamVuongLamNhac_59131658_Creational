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
public class Triangle extends Shape{

    private static Triangle instance;

    protected Triangle() {
        
    }
    
        public static Triangle createInstanceTriangle()
    {
        if(instance==null) instance = new Triangle();
        return instance;
    }    

    @Override
    public String draw() {
        return "vẽ hình tam giác";
    }
    
}
