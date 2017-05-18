/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJP;

import java.io.*;
import java.text.*;
import java.util.*;
/**
 *
 * @author Zhi Peng
 */
public class RetrieveBusRoutes {
    
    public static void main(String[] args) throws ParseException, IOException {
    // TODO Auto-generated method stub

    BufferedReader br = new BufferedReader(new FileReader("lta-bus_stop_codes.csv"));
    String busStopCode = null;
    String line =  null;
    HashMap<String, BusStopObj> BusStopInfo = new HashMap<String, BusStopObj>();
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
    }
    
}
