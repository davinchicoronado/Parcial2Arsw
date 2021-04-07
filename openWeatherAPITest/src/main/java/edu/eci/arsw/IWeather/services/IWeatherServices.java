/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.IWeather.services;

import edu.eci.arsw.IWeather.model.WeatherCity;

/**
 *
 * @author David Coronado
 */
public interface IWeatherServices {
    
        /**
     * Permite realizar una consulta a otra app o al cache si es el caso
     * 
     * @param city
     * @return información del clima de una ciudad
     */
    
    public WeatherCity getWeatherContry(String city);
    
}
