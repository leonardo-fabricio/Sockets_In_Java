package Sincrona;

import java.io.IOException;

public class ThreadReceberMensagem extends Base implements Runnable{

    public ThreadReceberMensagem(){
        new Thread(this).start();
    }

    @Override
    public void run(){
        try {
            while (true) {
                System.out.println("RESPOSTA: " + ReceberMensagem(con));
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
