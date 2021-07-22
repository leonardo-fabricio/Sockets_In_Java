package Sincrona;

import java.io.IOException;

public class ThreadReceberMensagem extends Base implements Runnable{
    private Tela t;
    public ThreadReceberMensagem(Tela aux){
        this.t = aux;
        new Thread(this).start();
    }

    @Override
    public void run(){

        try {
            while (true) {
               t.RecebeDados(ReceberMensagem(con));
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
