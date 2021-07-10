/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assincrona;

/**
 *
 * @author leonn
 */
import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Socket_servidor extends Thread1{
    
    public static void main(String args[]) throws InterruptedException{
        try{
            System.out.println("iniciando o servidor...");
            ServerSocket servidor = new ServerSocket(9000);
            System.out.println("O servidor passa a aguardar conexoes...");
            Socket cliente = servidor.accept();
            System.out.println("Cliente "+cliente.getInetAddress().getHostAddress()+" conectado!");
//            
           run(cliente);
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
    }
    
}

