package com.project.auto_showroom.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.job4j.carprice.model.CarBody;

@Repository
public interface CarBodyRepository extends CrudRepository<CarBody, Long> {
}
