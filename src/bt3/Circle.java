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
public class Circle extends Shape{
    private static Circle instance;

    protected Circle() {
        
    }
        public static Circle createInstanceCircle()
    {
        if(instance==null) instance = new Circle();
        return instance;
    }    

    @Override
    public String draw() {
       return "vẽ hình tròn";
    }
}
