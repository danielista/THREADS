package sample.vlakienka.twothreads;

public class Main {
    public static void main(String[] args) {

        Publisheris priducer = new Publisheris();
        Subscriberos sb = new Subscriberos();

        priducer.start();
        sb.start();

    }
}
