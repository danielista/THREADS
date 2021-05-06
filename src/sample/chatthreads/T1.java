package sample.chatthreads;

public class T1 implements Runnable{
    private Chat chat;
    private Thread t;
    private String[] s1 = {
      "Привет","как у тебя дела?", "čo robíš?", "paka"
    };

    //constructoris
    public T1(Chat chat) {
        this.chat = chat;
        t = new Thread(this,"Questioning thread");
        t.start(); //zavola metodu
    }

    @Override
    public void run() {
        for(String q:s1){
            chat.question(q);
        }
    }
}
