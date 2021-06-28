package com.repository;

import com.entity.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseWebRepository extends JpaRepository<Cours, String> {
}
