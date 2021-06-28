package com.services;

import com.DTO.CourseDtoOnce;
import com.entity.Cours;
import com.repository.CourseWebRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CoursService {

    @Autowired
    CourseWebRepository courseWebRepository;

    @Autowired
    CoursClient coursClient;

    public List<Cours> findAll() throws URISyntaxException {
        return coursClient.getCourses().stream()
                .map(this::toCours)
                .collect(Collectors.toList());
    }

    private Cours toCours(@NonNull CourseDtoOnce input) {
        return new Cours(input.getId(),
                input.getNumCode(),
                input.getCharCode(),
                input.getName(),
                input.getNominal(),
                input.getValue(),
                input.getPrevious());
    }
}
