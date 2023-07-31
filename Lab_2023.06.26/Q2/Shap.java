
package com.mycompany.q4;


abstract class Shap {
    
    protected double area;
    abstract double calculateArea();
    
    public void display(double area){
        System.out.println("Area= "+area);
    }
}
