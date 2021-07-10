/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assincrona;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author leonn
 * 
 * A TODO MOMENTO TEM QUE ESPERAR UMA RESPOSTA E A TODO MOMENTO PODE ENVIAR ALGO
 */

public class Thread1 extends Thread{
    public Thread1(){
        new Thread(this).start();
    }
    public static boolean envia(Socket cliente) throws IOException, InterruptedException{
        PrintStream devolve = new PrintStream (cliente.getOutputStream());
        System.out.print("PODE ENVIAR ALGO!!!\nESCREVA: ");
        Scanner t = new Scanner(System.in);
        
        devolve.println(t.nextLine());
        return true;
        
    }
    public static void recebe(Socket cliente) throws IOException, InterruptedException{
        Scanner leDoSocket = new Scanner(cliente.getInputStream());
        System.out.println("RESPOSTA: "+leDoSocket.nextLine());
    }
    public static void run(Socket cliente) throws IOException, InterruptedException{
        while(true){
            if(envia(cliente)){
                recebe(cliente);
                Thread.sleep(2000);
            }
        }
    }
}
