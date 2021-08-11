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

    @Column(name = "price")
    private double price;

    @OneToMany(mappedBy = "auto")
    private Set<User> users;

 public Auto(int id, String autoName, double price) {
  this.id = id;
  this.autoName = autoName;

  this.price = price;
 }

 public Auto() {
 }

 public int getId() {
  return id;
 }

 public void setId(int id) {
  this.id = id;
 }

 public String getAutoName() {
  return autoName;
 }

 public void setAutoName(String autoName) {
  this.autoName = autoName;
 }



 public double getPrice() {
  return price;
 }

 public void setPrice(double price) {
  this.price = price;
 }
}
