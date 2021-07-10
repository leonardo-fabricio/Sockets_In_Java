package Sincrona;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leonn
 */
public class sokets_Servidor {
    public static void main(String[] args) throws InterruptedException {
	try{
            System.out.println("iniciando o servidor...");
            ServerSocket servidor = new ServerSocket(9000);
            System.out.println("O servidor passa a aguardar conexoes...");
            Socket o_cliente = servidor.accept();
            System.out.println("Cliente "+o_cliente.getInetAddress().getHostAddress()+" conectado!");
//            
            
            PrintStream devolve = new PrintStream (o_cliente.getOutputStream());
            Scanner leDoSocketCliente = new Scanner(o_cliente.getInputStream());
            while(leDoSocketCliente.hasNextLine()){
                    System.out.println("RESPOSTA: "+leDoSocketCliente.nextLine());
                    System.out.print("ESCREVA: ");
                    Scanner t = new Scanner(System.in);
                    devolve.println(t.nextLine());
//                    Thread.sleep(2000);
            }
            leDoSocketCliente.close();
            leDoSocketCliente = null;
            o_cliente.close();
            o_cliente = null;
            servidor.close();
            servidor = null;
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
    }
}
//public static void main(String[] args) throws IOException {
//        try{
//            System.out.println("Iniciando");
//            ServerSocket sv = new ServerSocket(54321);
//            Socket cliente = sv.accept();
//
//            System.out.println("Cliente conectado: " + cliente.getInetAddress().getHostAddress());
//
//            PrintStream out = new PrintStream(cliente.getOutputStream()); //ENVIA DADOS
//            Scanner in = new Scanner(cliente.getInputStream()); //RECEBE DADOS DO CLIENTE
//
//
//            Scanner scan = new Scanner(System.in);
//            while(scan.hasNextLine()){
//                System.out.println(in.nextLine());
//                out.println(scan.hasNextLine());
//            }
//        }catch(NoSuchElementException e){
//            e.printStackTrace();
//        }
//    }


///////////////////////
//System.out.println("iniciando o servidor...");
//ServerSocket servidor = new ServerSocket(12345);
//System.out.println("O servidor passa a aguardar conexoes...");
//Socket o_cliente = servidor.accept();
//System.out.println("Cliente "+o_cliente.getInetAddress().getHostAddress()+" conectado!");
////Thread.sleep(2000);
//
//Scanner leDoSocketCliente = new Scanner(o_cliente.getInputStream());
//while(leDoSocketCliente.hasNextLine()){
//        System.out.println(leDoSocketCliente.nextLine());				
//}
//leDoSocketCliente.close();
//leDoSocketCliente = null;
//o_cliente.close();
//o_cliente = null;
//servidor.close();
//servidor = null;