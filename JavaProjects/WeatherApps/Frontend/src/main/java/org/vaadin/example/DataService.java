package org.vaadin.example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
public class DataService {
    public static WeatherResponse getWeather() throws URISyntaxException, IOException, InterruptedException{
        HttpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
            .uri(new URI("http://localhost:8080/weather"))
            .GET()
            .build();
    }
}

