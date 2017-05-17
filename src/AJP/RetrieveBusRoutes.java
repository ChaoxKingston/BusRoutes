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
    int busStopCode = 0;
    String line =  null;
    HashMap<Integer, String> BusStopInfo = new HashMap<Integer, String>();

    while((line=br.readLine())!=null){
        String str[] = line.split(",");
        for(int i=1;i<str.length;i++){
            String arr[] = str[i].split(":");
            BusStopInfo.put(Integer, arr[]);
        }
    }
    System.out.println(BusStopInfo);
 }
    
}
