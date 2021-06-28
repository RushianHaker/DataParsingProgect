package com.controller;

import com.entity.Cours;
import com.services.CoursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URISyntaxException;
import java.util.List;

@RestController
public class CoursParsingController {

    @Autowired
    private CoursService coursService;

    @GetMapping(value = "/usd")
    public List<Cours> getListUsdInformation() throws URISyntaxException {
        return coursService.findAll();
    }
}
