package com.project.auto_showroom.service;

import com.project.auto_showroom.entity.User;
import com.project.auto_showroom.repository.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;


import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;


@Service
public class UserService {
    private final UserRepository repository;
    /*private final Logger logger = LogManager.getLogger(UserService.class);*/


    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void add(User user) {
        this.repository.save(user);
    }

    public User findById(long id) {
        return this.repository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.valueOf(id)));
    }

    public User findByLogin(String login) {
        try {
            return this.repository.findByLogin(login);
        } catch (Exception e) {
            /*logger.debug("Failed to find user with this login.", e);*/
            return null;
        }
    }


    public boolean isCredential(String login, String password) {
        boolean result = false;
        User found = this.repository.findByLogin(login);
        if (found != null && password.equals(found.getPassword())) {
            result = true;
            /*logger.debug("User exist.");*/
        }
        return result;
    }


    public boolean isExist(User user) {
        boolean result = false;
        User found = this.repository.findByLogin(user.getLogin());
        if (found != null) {
            result = true;
            /*logger.debug("User exist.");*/
        }
        return result;
    }
}