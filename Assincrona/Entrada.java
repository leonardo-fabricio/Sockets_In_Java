/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assincrona;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 *
 * @author leonn
 * 
 * A TODO MOMENTO TEM QUE ESPERAR UMA RESPOSTA E A TODO MOMENTO PODE ENVIAR ALGO
 */

public class Entrada extends Thread{
    private Socket cliente = null;
    public Entrada(Socket c){
        this.cliente = c;
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            while (true) {
                BufferedReader ler = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
                System.out.println(ler.readLine());
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}