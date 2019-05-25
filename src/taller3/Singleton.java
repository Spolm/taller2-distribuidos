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
public class Singleton {
    
    private Singleton() {
    }
    
    public static Singleton getInstance() {
        return NewSingletonHolder.INSTANCE;
    }
    
    private static class NewSingletonHolder {

        private static final Singleton INSTANCE = new Singleton();
    }
    
    
    
    private int numero1;
    private int numero2;

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    
    
    public int sumar() {
        System.out.println("llamando a singleton con " + this.numero1 + " -- " + this.numero2);
        return this.numero1 + this.numero2;
    }
    
    
}
