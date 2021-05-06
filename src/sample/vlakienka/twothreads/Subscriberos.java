package sample.vlakienka.twothreads;

public class Subscriberos extends Thread{
    private Thread t;

    @Override
    public synchronized void start() {
        if(t == null){
            t = new Thread(this,"publisheris");
            t.start();
        }
    }

    @Override
    public void run() {
        System.out.println("aa");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("zobuĎ sa");
        synchronized (this){
            notifyAll();
        }
    }
}
