/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.IWeather.services.impl;

import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.IWeather.externalapi.HttpClientServices;
import edu.eci.arsw.IWeather.model.WeatherCity;
import edu.eci.arsw.IWeather.persistence.IWeatherCache;
import edu.eci.arsw.IWeather.services.IWeatherServices;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author David Coronado
 */
@Service
public class ImplIWeatherServices implements IWeatherServices{
    
    @Autowired
    IWeatherCache cache;
    
    
    @Autowired
    HttpClientServices connectionclient;

    @Override
    public WeatherCity getWeatherContry(String city) {
        if(cache.inCache(city)){
            return cache.getweatherCountry(city);
        
        }
        else{
            try { 
                
                String informationWheater =   connectionclient.getWheater(city);
                
           
                
                JSONObject jsonWheater = new JSONObject(informationWheater);
                JSONObject coord = new JSONObject(jsonWheater.get("coord").toString());
                
                JSONArray wheaterlist = jsonWheater.getJSONArray("weather");
                JSONObject wheater= new JSONObject(wheaterlist.get(0).toString());

                float lon =Float.parseFloat(coord.get("lon").toString());
                float lat =Float.parseFloat(coord.get("lat").toString());
                int id = Integer.parseInt(wheater.get("id").toString());
                
                WeatherCity wc = new WeatherCity(lon,lat,id,wheater.get("main").toString(),wheater.get("description").toString(),wheater.get("icon").toString());
                
                
                cache.saveweatherCountry(city, wc);
                      
                return wc;
                
            } catch (UnirestException ex) {
                Logger.getLogger(ImplIWeatherServices.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return null;
    }
    
    
}
