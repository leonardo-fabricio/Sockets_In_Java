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
    public void run(Socket cliente) throws IOException {
        BufferedReader ler = null;
        ler = new BufferedReader(new InputStreamReader(cliente.getInputStream()));

        while (true){
            System.out.println(ler.ready());
        }
    }
}
