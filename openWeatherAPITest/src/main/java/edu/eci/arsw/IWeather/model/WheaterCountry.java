/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.IWeather.model;

/**
 *
 * @author David Coronado
 */
public class WheaterCountry {
    private float lon;
    private float lat;
    
    
    public WheaterCountry(float lon,float lat){
    
        this.lon=lon;
        this.lat=lat;
    
    }

    public float getLon() {
        return lon;
    }

    public float getLat() {
        return lat;
    }

    public void setLon(float lon) {
        this.lon = lon;
    }

    public void setLat(float lat) {
        this.lat = lat;
    }
    
    
    
    
}
