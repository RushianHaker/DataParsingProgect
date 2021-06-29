package com.services;

import com.DTO.CourseDtoOnce;
import com.repository.CourseEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

@Service
public class CoursService implements ICoursService{

    @Autowired
    CourseEntityRepository courseEntityRepository;

    @Autowired
    CoursClient coursClient;

    public List<CourseDtoOnce> findUsd() throws URISyntaxException, IOException, InterruptedException {
        List<CourseDtoOnce> saved = courseEntityRepository.saveAll(coursClient.getCourses());
        return saved;
    }
}
