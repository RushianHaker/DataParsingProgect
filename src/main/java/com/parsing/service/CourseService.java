package com.parsing.service;

import com.parsing.dto.CourseDtoOnce;
import com.parsing.repository.CourseEntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Класс CourseService - бизнес логика проекта
 *
 * @author max
 */
@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseEntityRepository courseEntityRepository;
    private final CourseClient courseClient;

    public List<CourseDtoOnce> findCourseInfo(){
        return courseEntityRepository.saveAll(courseClient.getCourses());
    }
}
