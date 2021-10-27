package com.project.auto_showroom.controller;

import com.project.auto_showroom.entity.User;
import com.project.auto_showroom.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


@RestController
public class UserController {
    private final UserService userService;
    private final Logger logger = LogManager.getLogger(UserController.class);

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping(value = "/api/reg")
    public void regNewUser(HttpServletRequest req,
                           HttpServletResponse resp,
                           @RequestParam String login,
                           @RequestParam String password,
                           @RequestParam String confirm)
            throws IOException {
        HttpSession session = req.getSession();
        if (password.equals(confirm)) {
            User user = new User(login, password);
           /* logger.debug("New user: {}", user.toString());*/
            if (!this.userService.isExist(user)) {
                this.userService.add(user);
                session.setAttribute("id", user.getId());
                session.setAttribute("login", login);
                resp.sendRedirect("/");
            } else {
                resp.sendRedirect("/registration");
            }
        } else {
            logger.error("Password does not match!");
        }
    }

    @GetMapping(value = "/logout")
    public void logout(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        HttpSession session = req.getSession();
        session.invalidate();
        resp.sendRedirect("/login");
    }
}