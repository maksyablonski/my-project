package com.project.auto_showroom.config;

import com.project.auto_showroom.repository.UserRepository;
import com.project.auto_showroom.service.UserDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


/**
 * Configuration of security.
 * СONFIGURE IT!!!
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserRepository repository;

    /**
     * Authorisation from USERS table
     * in database.
     *
     * @param auth AuthenticationManagerBuilder
     * @throws Exception
     */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(new UserDetailService(repository));
    }

    /**
     * Configure filter for authorisation.
     *
     * @param http HttpSecurity
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login").usernameParameter("login")
                .permitAll()
                .and()
                .csrf().disable();
    }



    @Override
    public void configure(WebSecurity web) {
        web
                .ignoring()
                .antMatchers(
                        "/static/**",
                        "/js/*",
                        "/css/*",
                        "/images/*",
                        "/api/logout",
                        "/api/login",
                        "/api/reg",
                        "/registration"
                );

    }
}
