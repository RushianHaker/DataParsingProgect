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
    private RestTemplate restTemplate = new RestTemplate();

    public CourseDtoOnce getCourses() {
        String url = "http://localhost:8080/fake_usd_api.json";

        CourseDto response = restTemplate.getForObject(url, CourseDto.class);
        return response.getValute().getUsd();
    }
}
