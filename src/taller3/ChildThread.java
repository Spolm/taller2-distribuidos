/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;


/**
 *
 * @author franciscogomezlopez
 */
public class ChildThread implements Runnable {
    
    
    private String name;
    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public void run() {

        
           Singleton prueba = Singleton.getInstance();
           
           prueba.setNumero1(num1);
           prueba.setNumero2(num2);
           
           //voy a sumar
           System.out.println("name: " + this.name + " -- " + prueba.sumar());
           
        
        
    }
    
}
