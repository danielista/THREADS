package sample.vlakienka.twothreads;

public class Publisheris extends Thread{
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
        try {
        System.out.println("I am Publisher and iam WORKING");
        synchronized (this){
            wait();   // vlákno sa pozastaví ;)
        }


            System.out.println("AWAKING PUBLISHER"); //iba ak niekto ho zobudí
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
