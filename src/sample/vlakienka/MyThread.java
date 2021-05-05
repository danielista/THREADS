package sample.vlakienka;

public class MyThread implements Runnable{
    private String threadName;
    private Thread t; //objekt triedy Thread
    private int priority;

    // konštruktor :D ;) :D
    public MyThread(String threadName, int priority) {
        this.threadName = threadName;
        System.out.println("teraz vzniklo vlakienko: " + threadName);
        this.priority = priority;
    }

    @Override
    public void run() {
        System.out.println(threadName + "dane vlakno beží");

        for (int i = 1; i<=10; i++){
            System.out.println("vlakno "+threadName+": value: " + i );

        }
        System.out.println(threadName + ": sa ukončuje a končí");
    }

    public void start(){
        System.out.println("Starting " + threadName);
        if(t==null){
            t = new Thread(this,threadName);
            t.setPriority(priority);
            t.start();
        }

    }


}
