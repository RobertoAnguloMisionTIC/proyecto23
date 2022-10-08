package com.example.proyect23.service;

import com.example.proyect23.model.Message;

import java.util.List;

public interface MessageService {
    public void create(Message message);
    public List<Message> messages();
    public void update(Message message);
    public void delete(Integer id);
}
