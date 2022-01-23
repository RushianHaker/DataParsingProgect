package com.parsing.controller;

import com.parsing.services.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * CourseParsingController - реализация интерфейса базовых методов CourseEntityRepository
 *
 * @author max
 */
@RestController
@RequiredArgsConstructor
public class CourseParsingController {

    private final CourseService courseService;

    /**
     * Возвращает список курсов
     *
     * @return список курсов
     */
    @GetMapping(value = "/getCourse")
    public String getListInformation() {
        return courseService.findCourseInfo().toString();
    }
}
