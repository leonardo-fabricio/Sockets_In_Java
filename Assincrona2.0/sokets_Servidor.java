package Sincrona;


import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

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
                System.out.println("O servidor passa a aguardar conexoes...");
                con = server.accept();
        }

        public static void main(String[] args) throws InterruptedException, IOException {
                sokets_Servidor s = new sokets_Servidor(123);
                ThreadReceberMensagem receber = new ThreadReceberMensagem();
                ThreadMandarMensagem mandar = new ThreadMandarMensagem();
        }
}


