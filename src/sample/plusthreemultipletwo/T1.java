package sample.plusthreemultipletwo;

public class T1 implements Runnable{
    private Calculator calculator;
    private Thread t;
   // private String[] s1 = {
   //   "Привет","как у тебя дела?", "čo robíš?", "paka"
   // };

    //constructoris
    public T1(Calculator calculator) {
        this.calculator = calculator;
        t = new Thread(this,"Questioning thread");
        t.start(); //zavola metodu run
    }

    @Override
    public void run() {
        calculator.plusThree();
        //for(String q:s1){
        //    chat.question(q);
        //}
    }
}
