package com.services;

import com.DTO.CourseDto;
import com.DTO.CourseDtoOnce;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.List;


@Component
public class CoursClient {

    private RestTemplate restTemplate = new RestTemplate();

    public List<CourseDtoOnce> getCourses() throws IOException, InterruptedException {

        String url = "https://cbr.ru/scripts/XML_daily.asp?date_req=29/06/2021.xml";

        CourseDto response = restTemplate.getForObject(url, CourseDto.class);

        return response.getValute();

    }
}
