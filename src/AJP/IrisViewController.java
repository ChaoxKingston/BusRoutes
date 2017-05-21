/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJP;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.beans.property.ListProperty;
import javafx.beans.property.SimpleListProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;

/**
 * FXML Controller class
 *
 * @author Shizuka
 */
public class IrisViewController implements Initializable {
    @FXML
    private Button svcSearch;
    @FXML
    private Button stopSearch;
    @FXML
    private ComboBox<String> stopComboBox;
    @FXML
    private ComboBox<String> svcComboBox;
    //ListProperty<String> busService;
    @FXML
    private ListView busSvcList;
    @FXML
    private ListView busStopList;
    /**
     * Initializes the controller class.
     */
    
    private ListProperty<String> test1;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        DataLoader dl = new DataLoader();
        HashMap<String,BusStop> busStopInfo = dl.readBusStop("lta-bus_stop_codes.csv");
        HashMap<String,BusRoute> busRouteInfo = dl.readBusRoute("lta-sbst_route.csv");
        
        ObservableList<String> busStop = FXCollections.observableArrayList();
        ObservableList<String> busSvc = FXCollections.observableArrayList();
        
        for (Map.Entry<String,BusStop> e : busStopInfo.entrySet())
        {
            if(!"Non Stop".equals(e.getValue().getbusStopDesc()))
            busStop.add(e.getValue().getbusStopDesc());
        }
        stopComboBox.setItems(busStop);
        

        for (Map.Entry<String,BusRoute> e : busRouteInfo.entrySet())
        {
            busSvc.add(e.getValue().getSvcNum());
        }
        svcComboBox.setItems(busSvc);
        
        svcSearch.setOnAction((ActionEvent e) -> {
            for(Map.Entry<String,BusRoute> entry : busRouteInfo.entrySet())
            {                            
                ObservableList<String> test = FXCollections.observableArrayList();
                test.add(entry.getValue().getSvcNum());
                System.out.println(entry.getValue().getSvcNum());
                test1.set(test);

                busSvcList.itemsProperty().bind(test1);
//                for(BusStop stop : busStopInfo.values())
//                {
//
////                    if(stopComboBox.getValue().equals(stop.getbusStopDesc()))
////                    {
////                        while (stop.getBusStopcode().equals(route.getBusStopCode()))
////                        {
////
////                        }
////
////                    }
//                }
            }

        });
    }    
    
}
