package com.project.auto_showroom.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "manager")
public class Manager {

    @Id
    private int id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "manager")
    private List<User> users;

    public Manager(int id, String login, String password, List<User> users) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.users = users;
    }


    public Manager() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
