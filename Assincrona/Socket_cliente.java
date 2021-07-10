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
public class Socket_cliente extends Thread1{
    public static void main(String args[]) throws InterruptedException{
       try{
            Socket cliente = new Socket("127.0.0.1",9000);
            System.out.println("Conexao feita");
            
           run(cliente);
            
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

