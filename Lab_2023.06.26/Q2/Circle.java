
package com.mycompany.q4;


public class Circle extends Shap {
    protected double radius;
    
    public Circle (double radius){
        this.radius=radius;
    }
    
    @Override
    double calculateArea(){
        return area= 3.14*radius*radius;
    }
}
