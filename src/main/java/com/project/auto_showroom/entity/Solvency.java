package com.project.auto_showroom.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "solvency")
public class Solvency {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "solvency")
    private List<User> users;

    public Solvency() {
    }

    public Solvency(int id, String name, List<User> users) {
        this.id = id;
        this.name = name;
        this.users = users;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "Solvency{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
