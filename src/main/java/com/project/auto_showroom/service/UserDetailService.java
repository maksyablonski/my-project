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


import java.util.ArrayList;
import java.util.List;

@Service
public class UserDetailService implements UserDetailsService {
    /*rivate final Logger logger = LogManager.getLogger(UserDetailsService.class);*/
    private UserRepository repository;

    @Autowired
    public UserDetailService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
       /* logger.debug("Incoming login: {}", login);*/
        User user = this.repository.findByLogin(login);
       /* logger.debug("Found user: {}", user.toString());*/
        BCryptPasswordEncoder encoder = this.passwordEncoder();
        if (user != null) {
            List<GrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
            /*logger.debug("User found, login: {}", user.getLogin());*/
            return new org.springframework.security.core.userdetails.User(
                    user.getLogin(),
                    encoder.encode(user.getPassword()),
                    authorities
            );
        }
        throw new UsernameNotFoundException(
                String.format("User with login: %S not found.", login)
        );
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}