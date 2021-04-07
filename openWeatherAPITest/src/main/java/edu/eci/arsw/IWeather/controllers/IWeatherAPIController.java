/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.IWeather.controllers;

import edu.eci.arsw.IWeather.services.IWeatherServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author David Coronado
 */ 
@RestController
@RequestMapping(value = "/wheater")
public class IWeatherAPIController {
    @Autowired
    IWeatherServices wservices;
    
    
    @RequestMapping(path ="/{country}",method = RequestMethod.GET)
    public ResponseEntity<?> getWheaterCountry(@PathVariable ("country") String country){
        
        return new ResponseEntity<>(wservices.getWeatherContry(country),HttpStatus.ACCEPTED);
     
        
    }  
}
