package com.repository;

import com.entity.Rub;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRubRepository extends JpaRepository<Rub,Long> {

}
