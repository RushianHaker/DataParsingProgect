package com.controller;

import com.DTO.CourseDtoOnce;
import com.services.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class CoursParsingController {

    @Autowired
    private CoursService coursService;

    @GetMapping(value = "/getCourse")
    public List<CourseDtoOnce> getListInformation() throws URISyntaxException, IOException, InterruptedException {
        return coursService.findCourseInfo();
    }
}
