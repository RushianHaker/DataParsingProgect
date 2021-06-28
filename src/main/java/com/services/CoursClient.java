package com.services;

import com.DTO.CourseDto;
import com.DTO.CourseDtoOnce;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@Component
public class CoursClient {
    HttpClient httpClient = HttpClientBuilder.create().build();
    ClientHttpRequestFactory executeFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
    private RestTemplate restTemplate = new RestTemplate(executeFactory);

    public List<CourseDtoOnce> getCourses() throws URISyntaxException {
        String url = "https://www.cbr-xml-daily.ru/daily_json.js";

        try {
            CourseDto response = restTemplate.getForObject(new URI(url), CourseDto.class);
            return response.getUsd();

        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
}
