package com.project.auto_showroom.repository;

import com.project.auto_showroom.entity.Engine;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EngineRepository extends CrudRepository<Engine, Long> {
}
