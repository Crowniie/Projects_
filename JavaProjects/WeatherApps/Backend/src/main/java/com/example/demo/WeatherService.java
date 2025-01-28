package com.example.demo;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import com.google.gson.Gson;

@Service
public class WeatherService{
    private final WebClient webClient;
    private final Gson gson;


    public WeatherService(WebClient.Builder webClientBuilder){
        this.webClient = webClientBuilder.baseUrl("https://api.openweathermap.org/data/2.5").build();
        this.gson = new Gson();
    }

    public String getWeather(String city){
        return this.webClient.get()
        .uri(uriBuilder -> uriBuilder
            .path("/Weather")
            .queryParam("q",city)
            .queryParam("appid","7e36a122f2080a3fb5dfa60fa448a8c4")
            .build())
        .retrieve()
        .bodyToMono(String.class)
        .block();
    }
}