package Assincrona;
import java.io.IOException;
import java.io.PrintStream;
import java.net.*;

public class Saida extends Thread{
    public void run(Socket cliente, String txt){
        try {
            PrintStream envia = new PrintStream(cliente.getOutputStream());
            while (true){
                envia.println(txt);
            }
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
