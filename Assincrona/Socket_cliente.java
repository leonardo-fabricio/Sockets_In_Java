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

public class Socket_cliente extends JFrame{
    private static final long serialVersionUID = 1L;
    private Socket socket;
    private OutputStream ou;
    private Writer ouw;
    private BufferedWriter bfw;


    public Socket_cliente(String ip, String porta) throws IOException {
        Socket cliente = new Socket(ip, Integer.parseInt(porta));
        System.out.println("Cliente se conetou");
    }

//    public void conectar() throws IOException {
//        socket = new Socket(txtIP.getText(), Integer.parseInt(txtPorta.getText()));
//        ou = socket.getOutputStream();
//        ouw = new OutputStreamWriter(ou);
//        bfw = new BufferedWriter(ouw);
//        bfw.write(txtNome.getText() + "\r\n");
//        bfw.flush();
//    }

//    public void enviarMensagem(String msg) throws IOException {
//        if (msg.equals("Sair")) {
//            bfw.write("Desconectado \r\n");
//            texto.append("Desconectado \r\n");
//        } else {
//            bfw.write(msg + "\r\n");
//            texto.append(txtNome.getText() + " diz -> " + txtMsg.getText() + "\r\n");
//        }
//        bfw.flush();
//        txtMsg.setText("");
//    }
//
//    public void escutar() throws IOException {
//
//        InputStream in = socket.getInputStream();
//        InputStreamReader inr = new InputStreamReader(in);
//        BufferedReader bfr = new BufferedReader(inr);
//        String msg = "";
//
//        while (!"Sair".equalsIgnoreCase(msg))
//
//            if (bfr.ready()) {
//                msg = bfr.readLine();
//                if (msg.equals("Sair"))
//                    texto.append("Servidor caiu! \r\n");
//                else
//                    texto.append(msg + "\r\n");
//            }
//    }
//
//    public void sair() throws IOException {
//
//        enviarMensagem("Sair");
//        bfw.close();
//        ouw.close();
//        ou.close();
//        socket.close();
//    }
//
//    public void actionPerformed(ActionEvent e) {
//
//        try {
//            if (e.getActionCommand().equals(btnSend.getActionCommand()))
//                enviarMensagem(txtMsg.getText());
//            else if (e.getActionCommand().equals(btnSair.getActionCommand()))
//                sair();
//        } catch (IOException e1) {
//            // TODO Auto-generated catch block
//            e1.printStackTrace();
//        }
//    }
//
//    public void keyPressed(KeyEvent e) {
//
//        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
//            try {
//                enviarMensagem(txtMsg.getText());
//            } catch (IOException e1) {
//                // TODO Auto-generated catch block
//                e1.printStackTrace();
//            }
//        }
//    }

//    public void keyReleased(KeyEvent arg0) {
//        // TODO Auto-generated method stub
//    }
//
//
//    public void keyTyped(KeyEvent arg0) {
//        // TODO Auto-generated method stub
//    }

    public static void main(String[] args) throws IOException {

        Entrada lerdoservidor = new Entrada();
        
    }
}



