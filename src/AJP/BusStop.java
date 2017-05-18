/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AJP;

/**
 *
 * @author Zamiel Chia
 */
public class BusStop {
    
    /** Private Variables created for BusStop object to cater for LTA bus stop
     *  codes
     */ 
    private int busStopcode;
    private String roadDesc;
    private String busStopDesc;
    
    /** Public Constructor for Bus Stop object */
    public BusStop(int x, String y, String z) {
        this.busStopcode = x;
        this.roadDesc = y;
        busStopDesc = z;
    }
    
    public int getBusStopcode() {
        return busStopcode;
    }
    
    public String getroadDesc() {
        return roadDesc;
    }
    
    public String getbusStopDesc(){
        return busStopDesc;
    }
}
