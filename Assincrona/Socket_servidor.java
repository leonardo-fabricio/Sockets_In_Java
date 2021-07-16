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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Socket_servidor extends Thread{
    public Socket_servidor(String s) throws IOException{
        ServerSocket server = new ServerSocket(Integer.parseInt(s));
        JOptionPane.showMessageDialog(null,"Aguardando conexões","Sucess",JOptionPane.INFORMATION_MESSAGE);
        ClienteServer con = new ClienteServer(server.accept());
        JOptionPane.showMessageDialog(null,"Conexão Estabelecida","Sucess",JOptionPane.INFORMATION_MESSAGE);

        new Thread(() -> con.getMessage()).start();
        
    }
    public Socket loop(ClienteServer con){
        String msg;
        while ((msg = con.getMessage()) != null){

            System.out.println("Resposta: "+ msg );
        }
        return null;
    }
 
    public static void main(String []args) {

    }
} 


