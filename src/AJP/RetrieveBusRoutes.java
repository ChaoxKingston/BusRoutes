/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJP;

import java.io.*;
import java.text.*;
import java.util.*;
import java.util.Map.Entry;
import javax.swing.*;

import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.*;
/**
 *
 * @author Zhi Peng
 */
public class RetrieveBusRoutes extends Application {
    
    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;
    public static HashMap<String, BusStopObj> BusStopInfo = new HashMap<>();
    
    public static void main(String[] args) throws ParseException, IOException {
    // TODO Auto-generated method stub
    
    
    
    BufferedReader br = new BufferedReader(new FileReader("lta-bus_stop_codes.csv"));
    String busStopCode = null;
    String line =  null;
    
    BusStopInfo = new HashMap<String, BusStopObj>();
    br.readLine(); // Read line once to skip the headers
    
    while((line=br.readLine())!=null){
        String str[] = line.split(",");
        //int i = Integer.parseInt(str[0]);
        String i = str[0];
        BusStopObj bs = new BusStopObj(str[1], str[2]);
        BusStopInfo.put(i, bs);
    }
    
    //System.out.println(BusStopInfo);
    for (String key : BusStopInfo.keySet()) {
    System.out.println(key);
    System.out.println(BusStopInfo.get(key).toString());
    }
    
    launch(args);
    
    }
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        
        window = primaryStage;
        primaryStage.setTitle("Bus Routes");
        button = new Button("Submit");
        ObservableList<String> result = FXCollections.observableArrayList();
        comboBox = new ComboBox<>();
        for(Entry<String, BusStopObj> e : RetrieveBusRoutes.BusStopInfo.entrySet()){                  
            result.add(e.getKey());
            //BusStopInfo.setItemCaption(e.getKey(), e.getValue());
        }
        
        comboBox.setItems(result);
        /*
        comboBox.getItems().addAll( 
                "nemo",
                "nemo 2",
                "nemo 3"
        );
        */
        
        comboBox.setPromptText("Please select your destination");
        button.setOnAction(e -> printDestination());
        
        comboBox.setOnAction(e -> JOptionPane.showMessageDialog(null, "You have selected " + comboBox.getValue() + "."));
        
        /*
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        */
        
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(comboBox, button);
        
        scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    //Prints out selected destination
    private String printDestination() {
        String dest = comboBox.getValue();
        JOptionPane.showMessageDialog(null, "Your destination is " + dest + ".");
        
        return dest;
    }
    
}
