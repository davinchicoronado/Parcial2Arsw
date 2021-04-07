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
public class WeatherCity {
    private float lon;
    private float lat;
    private int id;
    private String main;
    private String description;
    private String icon;
    
    
    public WeatherCity(float lon,float lat, int id,String main,String description,String icon){
    
        this.lon=lon;
        this.lat=lat;
        this.id=id;
        this.main=main;
        this.description=description;
        this.icon=icon;
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

    public int getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
    
    
    
    
}
