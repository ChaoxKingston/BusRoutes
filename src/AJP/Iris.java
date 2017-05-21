/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJP;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 *
 * @author Zamiel Chia 
 */

// Main Class to Initialize whatever shit we need 
public class Iris extends Application{
    
    
    public static void main(String[] args) throws IOException {
          launch(args);
//        DataLoader dl = new DataLoader();
//        HashMap<String, BusStop> busStopInfo = dl.readBusStop("lta-bus_stop_codes.csv");
//        
//        for (String busStopCode : busStopInfo.keySet()) {
//            BusStop test = busStopInfo.get(busStopCode);
//            System.out.println(busStopCode);
//            System.out.println(test.getbusStopDesc());
//            System.out.println(test.getroadDesc()); 
//                 
//            
//        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // With reference to http://stackoverflow.com/questions/33881046/how-to-connect-fx-controller-with-main-app
        FXMLLoader loader = new FXMLLoader(getClass().getResource("IrisView.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        primaryStage.setTitle("Iris - Bus Finding Application");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
