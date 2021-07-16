/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assincrona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author leonn
 */
public class ClienteServer {
    private Socket cliente;
    private BufferedReader recebe;
    private PrintWriter envia;
    
    public ClienteServer(Socket cli) throws IOException{
        this.cliente = cli;
        this.recebe = new BufferedReader(new InputStreamReader(cli.getInputStream()));
        this.envia = new PrintWriter(cli.getOutputStream(), true);
    }
    public String getMessage(){
        try{
            return recebe.readLine();
        }catch(IOException ex){
            return null;
        }
    }
    public Boolean sendMsg(String msg){
        envia.println(msg);
        return true;
    }

    
}
