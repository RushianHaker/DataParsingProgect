package com.controller;

import com.entity.Rub;
import com.services.IRubService;
import com.services.RubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RubParsingController {

    RubService rubService;

    @GetMapping(value = "/getRub")
    public List<Rub> getAllRubValues(){
        return rubService.getAllCounts();
    }
}
