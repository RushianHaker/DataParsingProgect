package com.repository;

import com.DTO.CourseDtoOnce;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseEntityRepository extends JpaRepository<CourseDtoOnce, Long> {
}
