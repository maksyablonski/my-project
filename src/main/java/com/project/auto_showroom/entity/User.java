package com.project.auto_showroom.entity;

import javax.persistence.*;

@Entity
@Table(name ="users")
public class User {
   @Id
   @Column(name = "id_users")
    private int id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @ManyToOne
    @JoinColumn(name = "id")
    private Auto auto;

    @ManyToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;

    public User(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
