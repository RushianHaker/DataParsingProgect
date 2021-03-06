package com.parsing.repository;

import com.parsing.dto.CourseDtoOnce;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * CourseEntityRepository - класс с базовыми методами
 *
 * @author max
 */
public interface CourseEntityRepository extends JpaRepository<CourseDtoOnce, Long> {
}
