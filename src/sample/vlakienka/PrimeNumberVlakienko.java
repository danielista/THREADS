package sample.vlakienka;

public class PrimeNumberVlakienko extends Thread{
    private String threadName;
    private Thread t; //objekt triedy Thread
    private long base;

    public PrimeNumberVlakienko(String threadName, long base) {
        this.threadName = threadName;
        this.base = base;
    }

    @Override
    public void run() {
        System.out.println("vlakno beží");

       while (checkPrime(base) == 0){
           base = base+1;
       }

        System.out.println("vlakno skončilo");
    }

    static int checkPrime(long n){
        long i,m=0,flag=0;
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    return 0;
                    //break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number");
            return 1;}
        }//end of else
        return 0;
    }

    @Override
    public void start() {
        if(t==null){
            t = new Thread(this,threadName);
            //t.setPriority(priority);
            t.start();
        }
    }
}
