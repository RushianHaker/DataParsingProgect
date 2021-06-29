package com.services;

import com.DTO.CourseDto;
import com.DTO.CourseDtoOnce;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
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
