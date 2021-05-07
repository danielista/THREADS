package sample.plusthreemultipletwo;

public class T2 implements Runnable{
    private Calculator calculator;
    private Thread t;
    //  private String[] s2 = {
    //  "Serwus","POGODA stále lepšie", "učím sa vlákna", "MAJ SA"
    //  };

    //constructoris
    public T2(Calculator calculator) {
        this.calculator = calculator;
        t = new Thread(this,"Answering thread");
        t.start();
    }

    @Override
    public void run() {
        calculator.multipTwo();

        //for(String a:s2){
        //    chat.answer(a);
        //}
    }
}
