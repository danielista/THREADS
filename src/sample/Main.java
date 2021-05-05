package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.abstraktnetriedy.Car;
import sample.abstraktnetriedy.VehicleRental;
import sample.vlakienka.MyThread;
import sample.vlakienka.PrimeNumberVlakienko;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

    }

    public static void main(String[] args) throws InterruptedException {
        //launch(args);

        //skuška abstraktných tried:
        //Car ferari1 = new Car();
        //ferari1.addSpeed();
        //ferari1.printInfo();
        //System.out.println(ferari1.getMaxSpeed());

        //MyThread thread1 = new MyThread("Thread 1",2);
        //thread1.start();

        PrimeNumberVlakienko prvocislo = new PrimeNumberVlakienko("Thread 2",399833221);
        prvocislo.start();

        System.out.println("--> ja som main :D");




    }
}
