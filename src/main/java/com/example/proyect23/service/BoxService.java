package com.example.proyect23.service;

import com.example.proyect23.model.Box;

import java.util.List;

public interface BoxService {
    public void create(Box box);
    public List<Box> boxs();
    public void update(Box box);
    public void delete(Integer id);
}
