package com.project.auto_showroom.service;

import com.project.auto_showroom.entity.CarBody;
import com.project.auto_showroom.repository.CarBodyRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.persistence.EntityNotFoundException;
import java.util.List;

/**
 * Class for service methods with CarBody objects.
 * Singleton by default.
 */
@Service
public class CarBodyService {
    private final CarBodyRepository repository;
    /*private final Logger logger = LogManager.getLogger(CarBodyService.class);*/

    @Autowired
    public CarBodyService(CarBodyRepository repository) {
        this.repository = repository;
    }


    public CarBody findById(long id) {
        return this.repository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.valueOf(id)));
    }


    public List<CarBody> findAll() {
        return (List<CarBody>) this.repository.findAll();
    }
}