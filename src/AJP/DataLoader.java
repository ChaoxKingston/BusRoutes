/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJP;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 *
 * @author Zamiel Chia
 */
public class DataLoader {
    
    // Read bus stop information and put them into a hash map
    public HashMap<String, BusStop> readBusStop(String file) {
        HashMap <String, BusStop> busStopInfo = new HashMap<>();
        try 
        {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            StringTokenizer st; // to break strings into token
            br.readLine(); // Read line once to skip the headers
            while ((line = br.readLine()) != null) 
            {
                String[] test = line.split(","); // split the data as its separated with a ',' 
                //http://stackoverflow.com/questions/2356251/string-tokenizer-in-java
                String busStopCode = test[0];
                String roadDesc = test[1];
                String busStopDesc = test[2];
                BusStop busstops = new BusStop(busStopCode,roadDesc,busStopDesc);
                busStopInfo.put(busstops.getBusStopcode(), busstops);
            } 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return busStopInfo;
    }
    
    public HashMap<String, BusRoute> readBusRoute(String file) {
        HashMap<String, BusRoute> busRouteInfo = new HashMap<>();
        try 
        {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            StringTokenizer st;
            br.readLine();
            while(( line = br.readLine()) != null) 
            {
                String [] test = line.split(",");
                String svcNum = test[0];
                int dir = Integer.parseInt(test[1]);
                int routeSeq = Integer.parseInt(test[2]);
                String busStopCode = test[3];
                double distance = Double.parseDouble(test[4]);
                BusRoute busroutes = new BusRoute(svcNum, dir, routeSeq, busStopCode, distance);
                busRouteInfo.put(busroutes.getSvcNum(), busroutes);
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
        return busRouteInfo;
    }
}
