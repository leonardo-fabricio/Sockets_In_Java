package Sincrona;

import java.io.IOException;

public class ThreadMandarMensagem extends Base implements Runnable{
    public ThreadMandarMensagem(){
        new Thread(this).start();
    }

    @Override
    public void run() {
        try {
            while (true) {
                mandarMensagem(con);
            }
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }
    }
}
