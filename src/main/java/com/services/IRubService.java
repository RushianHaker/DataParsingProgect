package com.services;

import com.entity.Rub;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IRubService {
    void save(Rub rub);
    boolean isExist(String rubCount);
    List<Rub> getAllCounts();
}
