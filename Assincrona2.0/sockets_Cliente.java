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
import javax.swing.*;
import java.io.*;
import java.net.Socket;


import java.util.Scanner;
public class sockets_Cliente extends Base{


    public sockets_Cliente(String ip, int porta) throws IOException, InterruptedException {
        this.con = new Socket(ip,porta);
        JOptionPane.showMessageDialog(null,"Conexão Realizada","Conexão Feita", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) throws ClassNotFoundException, IOException, InterruptedException {
        sockets_Cliente sc = new sockets_Cliente("localhost",123);
        Tela t = new Tela();
        t.mudaNome("Cliente");

        ThreadMandarMensagem mandar = new ThreadMandarMensagem();
        ThreadReceberMensagem receber = new ThreadReceberMensagem(t);

        t.setVisible(true);
    }



}

