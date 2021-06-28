package com.services;

import com.entity.Rub;
import com.repository.IRubRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class RubService implements IRubService {

    @Autowired
    IRubRepository rubRepository;

    @Override
    public void save(Rub rub) {
        rubRepository.save(rub);
    }

    @Override
    public boolean isExist(String rubCount) {
        List<Rub> rub = rubRepository.findAll();
        for (Rub i : rub) {
            if(i.getCount().equals(rubCount)){
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Rub> getAllCounts() {
        return rubRepository.findAll();
    }
}
