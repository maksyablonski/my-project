package com.project.auto_showroom.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name ="users")
public class User {
   @Id
   @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String username;

    @Column(name = "login")
    private String login;


    @Column(name = "password")
    private String password;

   @ManyToOne
   @JoinColumn(name = "solvency_id")
   private Solvency solvency;

  /*  @ManyToOne
    @JoinColumn(name = "manager_id")
    private Manager manager;
*/


    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
    @JoinTable(name = "user_role",
    joinColumns = {
            @JoinColumn(name = "user_id")},
            inverseJoinColumns = {
            @JoinColumn(name = "role_id")})
    private Set<Role> roles = new HashSet<>();


}
