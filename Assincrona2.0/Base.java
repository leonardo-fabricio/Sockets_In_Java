package Sincrona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

import java.util.Scanner;

public class Base{
    public static Socket con;
    public static ServerSocket server;
    public static String str;

    public void setStr(String s){
        str = s;
    }

    public String ReceberMensagem(Socket con) throws IOException {
        //con.setTcpNoDelay(true);
        BufferedReader leDoSocketCliente = new BufferedReader(new InputStreamReader(con.getInputStream()));
        return leDoSocketCliente.readLine();
    }
    public void mandarMensagem(Socket con) throws IOException {
        try{
            PrintStream devolve = new PrintStream(con.getOutputStream());
            if (!(str.equals(""))) {
                devolve.println(str);
                devolve.flush();
                str = "";
            }
        }catch(NullPointerException e){
            //System.out.println(e.getMessage());
        }

    }

}

/*
 * HEHEHEHEHEHEHE, quase lá
 * PASSOS:
 *
 * dx eu pensar aq,
 *
 * 1 - criar a thred
 * 2- ela vai observar buffer
 * 3 - ela vai enviar aquilo que ta no buffer
 * 4 - começa tudo de novo ou limpa o buffer
 *
 * */