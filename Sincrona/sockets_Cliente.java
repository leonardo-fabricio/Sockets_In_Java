package Sincrona;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leonn
 */
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.net.*;
import java.net.Socket;
import java.util.Date;
import java.util.NoSuchElementException;
import java.net.ConnectException;

import java.util.Scanner;
public class sockets_Cliente {
    public static void main(String[] args) throws ClassNotFoundException{
        try{
            Socket cliente = new Socket("127.0.0.1",9000);
            System.out.println("Conexao feita");
            
            Scanner leDoSocketServidor = new Scanner(cliente.getInputStream());
            PrintStream envia = new PrintStream (cliente.getOutputStream());
            Scanner t = new Scanner(System.in);
            while(t.hasNextLine()){
                envia.println(t.nextLine());
                System.out.println("\nRESPOSTA: "+leDoSocketServidor.nextLine());
                System.out.print("ESCREVA: ");
            }
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
    }
}
//            RECEBE DATA E HORA DA CONEXAO DO SERVIDOR
//            ObjectInputStream in = new ObjectInputStream(cliente.getInputStream());
//            String objt = (String)entrada.readObject();;
//            System.out.println(data_atual.toString());
