package com.project.auto_showroom.repository;
import com.project.auto_showroom.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    User findByLogin(String login);
}
