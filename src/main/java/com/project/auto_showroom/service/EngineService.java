package com.project.auto_showroom.service;

import com.project.auto_showroom.entity.Engine;
import com.project.auto_showroom.repository.EngineRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.persistence.EntityNotFoundException;
import java.util.List;


@Service
public class EngineService {
    private final EngineRepository repository;
  /*  private final Logger logger = LogManager.getLogger(EngineService.class);*/

    @Autowired
    public EngineService(EngineRepository repository) {
        this.repository = repository;
    }

    public Engine findById(long id) {
        return this.repository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.valueOf(id)));
    }

    public List<Engine> findAll() {
        return (List<Engine>) this.repository.findAll();
    }
}
