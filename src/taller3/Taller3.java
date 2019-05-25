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
public class Taller3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creando Singletone para recurso compartido;
        Singleton compartido = Singleton.getInstance();
        
        for (int i =1; i < 11; i++) {
            
            ChildThread child = new ChildThread();
            child.setNum1(i + 10);
            child.setNum2(i + 20);
            child.setName("test " + i);
            
            Thread hilo = (new Thread(child));
                    hilo.setName("test " + i);
                    hilo.start();
                    
        }
        
    }
    
}
