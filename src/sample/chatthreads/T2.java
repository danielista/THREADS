package sample.chatthreads;

public class T2 implements Runnable{
    private Chat chat;
    private Thread t;
    private String[] s2 = {
      "Serwus","POGODA stále lepšie", "učím sa vlákna", "MAJ SA"
    };

    //constructoris
    public T2(Chat chat) {
        this.chat = chat;
        t = new Thread(this,"Answering thread");
        t.start();
    }

    @Override
    public void run() {
        for(String a:s2){
            chat.answer(a);
        }
    }
}
