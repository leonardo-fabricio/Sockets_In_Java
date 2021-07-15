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

    private static ArrayList<BufferedWriter>clientes;
    private static ServerSocket server;
    private String nome;
    private Socket cliente;
    private InputStream recebe;
    private InputStreamReader leitura;
    private BufferedReader bufer;

    public Socket_servidor(String s) throws IOException{
        ServerSocket server = new ServerSocket(Integer.parseInt(s));
        System.out.println("Aguardando conexão...");
        Socket con = server.accept();
        System.out.println("conexão Feita...");
//        this.cliente = con; //Cria cliente
//        try {
//            recebe  = con.getInputStream(); //recebe dados do cliente
//            leitura = new InputStreamReader(recebe); //recebe os bytes e transforma em caracteres
//            bufer = new BufferedReader(leitura); // Salva tudo no bufer
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public void run(){
        //Sempre que um novo cliente se conecta esse metodo eh acionado
        // Vai rodar infinitamente ate q o usuario se desconecte

        try{

            String msg;
            OutputStream envia =  this.cliente.getOutputStream();
            Writer escreve = new OutputStreamWriter(envia);
            BufferedWriter escrevebufer = new BufferedWriter(escreve);

            nome = msg = bufer.readLine();

            while(!"Sair".equalsIgnoreCase(msg) && msg != null)
            {
                msg = bufer.readLine();
                sendToAll(escrevebufer, msg);
                System.out.println(msg);
            }

        }catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void sendToAll(BufferedWriter bwSaida, String msg) throws  IOException
    {
        BufferedWriter bwS;

        for(BufferedWriter bw : clientes){
            bwS = (BufferedWriter)bw;
            if(!(bwSaida == bwS)){
                bw.write(nome + " -> " + msg+"\r\n");
                bw.flush();
            }
        }
    }
    public static void main(String []args) {

    }// Fim do método main
} //Fim da classe


