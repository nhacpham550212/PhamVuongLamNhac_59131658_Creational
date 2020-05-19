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
public  class ShapeFactory  {
   
    public static Shape createShape(ShapeType type)
    {
        switch(type)
        {
            case Circle: return  Circle.createInstanceCircle();
            case Triangle: return  Triangle.createInstanceTriangle();
            case Rectangle:  return  Rectangle.createInstanceRectangle();
        }  
        return null;
    }
}
