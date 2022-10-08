package com.example.proyect23.service;

import com.example.proyect23.model.Client;

import java.util.List;

public interface ClientService {
    public void create(Client client);
    public List<Client> clients();
    public void update(Client client);
    public void delete(Integer id);
}
