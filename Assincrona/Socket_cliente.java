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
import static com.sun.glass.ui.Cursor.setVisible;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.net.Socket;
import java.util.Scanner;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Socket_cliente extends Thread{
    private static Socket cliente = null;
    
    public Socket_cliente(String ip, String porta) throws IOException {
        
        this.cliente = new Socket(ip, Integer.parseInt(porta));
        JOptionPane.showMessageDialog(null,"Conexão Estabelecida","Sucess",JOptionPane.INFORMATION_MESSAGE);
    }
    public Socket getCliente(){
        return cliente;
    }
    public static void main(String[] args) throws IOException {
//        Entrada ler = new Entrada();
//        Saida envia = new Saida(cliente, txt);
//        while(true){
//            ler.start();
//            envia.start();
//        }
          
    }
}



