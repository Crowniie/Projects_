package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.beans.factory.annotation.Autowired;



@RestController
public class Controller {
    @Autowired
    private WebClient.Builder webClientBuilder;
    @GetMapping("/weather")
    public String SendWeather(){
        WeatherService service = new WeatherService(webClientBuilder);
        
        return ; 
    }
}
