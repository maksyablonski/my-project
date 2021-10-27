package com.project.auto_showroom.service;
import com.project.auto_showroom.entity.Transmission;
import com.project.auto_showroom.repository.TransmissionRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.persistence.EntityNotFoundException;
import java.util.List;


@Service
public class TransmissionService {
    private final TransmissionRepository repository;
    /*private final Logger logger = LogManager.getLogger(TransmissionService.class);*/

    @Autowired
    public TransmissionService(TransmissionRepository repository) {
        this.repository = repository;
    }

    public Transmission findById(long id) {
        return this.repository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.valueOf(id)));
    }

    public List<Transmission> findAll() {
        return (List<Transmission>) this.repository.findAll();
    }
}
