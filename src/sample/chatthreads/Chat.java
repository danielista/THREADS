package sample.chatthreads;

public class Chat {
    boolean flag = false;


    public synchronized void question(String msg){
        if(flag == true){
            try {
                wait();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = true;
        notify();
    }

    public synchronized void answer(String ans){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(ans);
        flag=false;
        notify();
    }

}
