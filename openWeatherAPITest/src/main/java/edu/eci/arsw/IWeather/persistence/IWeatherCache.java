/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.IWeather.persistence;

import java.util.HashMap;
import org.springframework.stereotype.Service;

/**
 *
 * @author David Coronado
 */

@Service
public class IWeatherCache {
    
     HashMap<String, String> weatherCountries= new HashMap();
    
       /**
     * Metodo que verifica si hay informacion del cilma de un pais
     * @param country
     * @return boolean
     */
    
    public boolean inCache(String country){
         if(weatherCountries.containsKey(country)){
             return true;
         }
         else{
             return false;
         }
     }
     
           /**
     * Metodo que permite obtener la informacion del clima de un pais
     * @param country
     * @return boolean
     */
    
     public String getweatherCountry(String country){         
         return weatherCountries.get(country);
     }
      /**
     * Metodo que permite guardar la informacion del clima de un pais
     * @param country
     * @param information wheater
     * 
     */
     
     public void saveweatherCountry(String country,String information){ 
         weatherCountries.put(country, information);
     }
    
}
