package com.project.auto_showroom.repository;

import com.project.auto_showroom.entity.Transmission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransmissionRepository extends CrudRepository<Transmission, Long> {
}
