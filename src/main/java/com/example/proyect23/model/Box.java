package com.example.proyect23.model;

import javax.persistence.*;

@Entity
@Table(name = "box")
public class Box {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String location;
    private int capacity;
    private int category_id;
    private String name;

    public Box() {
    }

    public Box(Integer id, String location, int capacity, int category_id, String name) {
        this.id = id;
        this.location = location;
        this.capacity = capacity;
        this.category_id = category_id;
        this.name = name;
    }

    public Box(String location, int capacity, int category_id, String name) {
        this.location = location;
        this.capacity = capacity;
        this.category_id = category_id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
