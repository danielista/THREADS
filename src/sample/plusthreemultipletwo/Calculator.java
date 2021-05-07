package sample.plusthreemultipletwo;

public class Calculator {
    boolean flag = false;

    //t1 *2
    //t2 +3
    int value = 1;

    public synchronized void plusThree(){
        while (value<1000){

        if(flag == true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value = value + 3;
        System.out.println(value);
        flag=true;
        notify();
        }
    }

    public synchronized void multipTwo(){
        while (value<1000){

        if(flag != true){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        value = value * 2;
        System.out.println(value);
        flag=false;
        notify();
        }
    }




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
