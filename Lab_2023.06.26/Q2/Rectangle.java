
package com.mycompany.q4;


public class Rectangle extends Shap{
    private double width;
    private  double height;
    
    public Rectangle (double w,double h){
        this.width=w;
        this.height=h;
    }
    @Override
    double calculateArea(){
        return area= width*height;
    }
}
