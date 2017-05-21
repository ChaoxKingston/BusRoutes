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
public class BusRoute {
    
    private String svcNum;
    private int dir;
    private int routeSeq;
    private String busStopCode;
    private double distance;
    
    public BusRoute(String a, int b, int c, String d, double e) {
        this.svcNum = a;
        this.dir = b;
        this.routeSeq = c;
        this.busStopCode = d;
        this.distance = e;
    }
    
    public String getSvcNum() {
        return svcNum;
    }
    
    public int getDir() {
        return dir;
    }
    
    public int getRouteSeq() {
        return routeSeq;
    }
    
    public String getBusStopCode() {
        return busStopCode;
    }
    
    public double getDistance() {
        return distance;
    }
}
