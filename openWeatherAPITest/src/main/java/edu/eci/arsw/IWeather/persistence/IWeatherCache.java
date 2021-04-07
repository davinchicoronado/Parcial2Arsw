/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.IWeather.persistence;

import edu.eci.arsw.IWeather.model.WeatherCity;
import java.util.HashMap;
import org.springframework.stereotype.Service;

/**
 *
 * @author David Coronado
 */

@Service
public class IWeatherCache {
    
     HashMap<String, WeatherCity> weatherCountries= new HashMap();
    
       /**
     * Metodo que verifica si hay informacion del cilma de una ciudad
     * @param city
     * @return boolean
     */
    
    public boolean inCache(String city){
         if(weatherCountries.containsKey(city)){
             return true;
         }
         else{
             return false;
         }
     }
     
           /**
     * Metodo que permite obtener la informacion del clima de un pais
     * @param city
     * @return boolean
     */
    
     public WeatherCity getweatherCountry(String city){         
         return weatherCountries.get(city);
     }
      /**
     * Metodo que permite guardar la informacion del clima de un pais
     * @param city 
     * @param wc information clima
     */
     
     public void saveweatherCountry(String city,WeatherCity wc){ 
         weatherCountries.put(city, wc);
     }
    
}
