package AJP;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zhi Peng
 */
public class BusStopObj {
    String roadDesc=null;
    String busStopDesc=null;
    
    public BusStopObj() {
        
    }
    
    public BusStopObj(String roadDesc, String busStopDesc) {
        this.roadDesc=roadDesc;
        this.busStopDesc=busStopDesc;
    }

    public void setRoadDesc(String roadDesc) {
        this.roadDesc = roadDesc;
    }

    public void setBusStopDesc(String busStopDesc) {
        this.busStopDesc = busStopDesc;
    }
    
    public String getRoadDesc() {
        return roadDesc;
    }
    
    @Override
    public String toString(){
        return roadDesc + " " + busStopDesc;
    }
    
    //map.get(busStopCode).toString();
    
}
