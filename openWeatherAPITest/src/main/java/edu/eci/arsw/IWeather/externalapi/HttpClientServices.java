/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.IWeather.externalapi;
import org.springframework.stereotype.Service;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;


/**
 *
 * @author David Coronado
 */
@Service
public class HttpClientServices {
    
    
    public String getWheater(String country) throws UnirestException {
        
        HttpResponse<String> response = Unirest.get("http://api.openweathermap.org/data/2.5/weather?q="+country+"&appid=8afbc8e19fe0bea83d243309b7d5f76d")
                .asString();
        
        return response.getBody();
    
    }  
    
}
