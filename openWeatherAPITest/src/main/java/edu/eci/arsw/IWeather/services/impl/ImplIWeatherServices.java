/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.IWeather.services.impl;

import com.google.gson.Gson;
import com.mashape.unirest.http.exceptions.UnirestException;
import edu.eci.arsw.IWeather.externalapi.HttpClientServices;
import edu.eci.arsw.IWeather.model.WheaterCountry;
import edu.eci.arsw.IWeather.persistence.IWeatherCache;
import edu.eci.arsw.IWeather.services.IWeatherServices;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    public String getWeatherContry(String country) {
        if(cache.inCache(country)){
            return cache.getweatherCountry(country);
        
        }
        else{
            try { 
                
                String informationWheater =   connectionclient.getWheater(country);
                
                
                
                //final Gson gson = new Gson();
                //final Properties properties = gson.fromJson(informationWheater, Properties.class);
                //WheaterCountry wc = new WheaterCountry(Float.parseFloat(properties.getProperty("lon")),Float.parseFloat(properties.getProperty("lot")));
                
                cache.saveweatherCountry(country, informationWheater);
                
                
                
                return informationWheater;
                
            } catch (UnirestException ex) {
                Logger.getLogger(ImplIWeatherServices.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return null;
    }
    
    
}
