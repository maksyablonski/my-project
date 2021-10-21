package com.project.auto_showroom.repository;

import com.project.auto_showroom.entity.CarBody;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CarBodyRepository extends CrudRepository<CarBody, Long> {
}
