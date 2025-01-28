package org.vaadin.example;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.lang.reflect.Type;

import org.vaadin.example.WeatherResponse.Weather;

public class DataService {
    public static ArrayList<WeatherResponse> getWeather() throws URISyntaxException, IOException, InterruptedException{
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI("http://localhost:8080/weather"))
            .GET()
            .build();
        HttpResponse<String> response = client.send(request,HttpResponse.BodyHandlers.ofString());
        String responseBody = response.body();
        Gson gson = new Gson();
        Type weatherResponseType= new TypeToken<ArrayList<WeatherResponse>>(){}.getType(); 
        ArrayList<WeatherResponse> weatherResponse = gson.fromJson(responseBody, weatherResponseType);
        
        return weatherResponse;
    }
}

