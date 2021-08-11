package com.project.auto_showroom.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "auto_type")
public class Auto {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "auto_name")
    private String autoName;

    @Column(name = "id_users")
    private int idUsers;

    @Column(name = "price")
    private double price;

}
