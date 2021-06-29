package com.services;

import com.DTO.CourseDtoOnce;
import com.repository.CourseEntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
public class CoursService {

    @Autowired
    CourseEntityRepository courseEntityRepository;

    @Autowired
    CoursClient coursClient;

    public List<CourseDtoOnce> findCourseInfo() throws IOException, InterruptedException {
        List<CourseDtoOnce> saved = courseEntityRepository.saveAll(coursClient.getCourses());
        return saved;
    }
}
