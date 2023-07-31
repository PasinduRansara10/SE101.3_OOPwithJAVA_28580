/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.myffirstinterface;

/**
 *
 * @author Pasindu
 */
public class IterfaceImplimented implements MyFirstInterface {

    public static void main(String[] args) {
        IterfaceImplimented i1=new IterfaceImplimented();
        i1.display();
    }

    @Override
    public void display() {
        System.out.println(x);
    }
}


