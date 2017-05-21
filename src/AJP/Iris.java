/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJP;

import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author Zamiel Chia 
 */

// Main Class to Initialize whatever shit we need 
public class Iris {
    public static void main(String[] args) throws IOException {
        DataLoader dl = new DataLoader();
        HashMap<String, BusStop> busStopInfo = dl.readBusStop("lta-bus_stop_codes.csv");
        
        for (String busStopCode : busStopInfo.keySet()) {
            BusStop test = busStopInfo.get(busStopCode);
            System.out.println(busStopCode);
            System.out.println(test.getbusStopDesc());
            System.out.println(test.getroadDesc()); 
                 
            
        }
    }
}
