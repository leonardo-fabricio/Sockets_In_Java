package Sincrona;


import javax.swing.*;
import java.io.*;
import java.net.ServerSocket;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author leonn
 */

public class sokets_Servidor extends Base {

        public sokets_Servidor(int porta) throws IOException {
                server = new ServerSocket(porta);
                JOptionPane.showMessageDialog(null,"O servidor passa a aguardar conexoes...","Aguardando Conexão", JOptionPane.INFORMATION_MESSAGE);
                con = server.accept();
        }

        public static void main(String[] args) throws InterruptedException, IOException {
                sokets_Servidor s = new sokets_Servidor(123);
                Tela t = new Tela();
                t.mudaNome("Servidor");
                ThreadReceberMensagem receber = new ThreadReceberMensagem(t);
                ThreadMandarMensagem mandar = new ThreadMandarMensagem();

                t.setVisible(true);
        }
}


