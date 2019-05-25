/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
//import java.net.Socket;
/**
 *
 * @author Luis Machado
 */
public class TallerSuma {
 
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        int numero1, numero2;
        
        while (true) {
            ServerSocket serverSocket = new ServerSocket(9000);
        
            Socket clientSocket = serverSocket.accept();
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            String greeting = in.readLine();
            String valores[] = greeting.split("#");
            ChildThread child = new ChildThread();
            child.setNum1(Integer.parseInt(valores[0]));
            child.setNum2(Integer.parseInt(valores[1]));
            //int suma = numero1 + numero2;
            
            //out.println("Suma: " + suma);
            in.close();
            out.close();            
            
            clientSocket.close();
            serverSocket.close();
        }
    }
    
}
