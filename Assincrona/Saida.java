package Assincrona;
import java.io.*;
import java.net.*;

public class Saida extends Thread{
    private Socket cliente = null;
    private String txt = "";
    private String nome = "";
    public Saida(Socket c,String s){
        this.cliente = c;
        this.txt = s;
        this.nome = nome;
        new Thread(this).start();
    }
    public void run(){
        try {
            OutputStream ou = cliente.getOutputStream();
            OutputStreamWriter ouw = new OutputStreamWriter(ou);
            BufferedWriter bfw = new BufferedWriter(ouw);

            while (true){
                bfw.write("Cliente " + "\r\n");
                bfw.flush();
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        catch (NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }
}
//                    OutputStream ou = cliente.getOutputStream();
//                    OutputStreamWriter ouw = new OutputStreamWriter(ou);
//                    BufferedWriter bfw = new BufferedWriter(ouw);
//                    bfw.write("Cliente " + "\r\n");
//                    bfw.flush();
//                    chamamsg();
//                    this.dispose();