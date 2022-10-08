package com.example.proyect23.service;

import com.example.proyect23.model.Client;
import com.example.proyect23.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ClientImplementation implements ClientService{
    @Autowired
    private ClientRepository clientRepository;

    @Override
    @Transactional
    public void create(Client client) {
        if(client.getId() != null){
            if(clientRepository.existsById(client.getId())){
            }else{
                clientRepository.save(client);
            }
        }else {
            clientRepository.save(client);
        }
    }

    @Override
    public List<Client> clients() {
        return (List<Client>) clientRepository.findAll();
    }

    @Override
    @Transactional
    public void update(Client client) {
        if (clientRepository.existsById(client.getId())){
            clientRepository.save(client);
            return;
        }else
            return;
    }

    @Override
    public void delete(Integer id) {
        if(clientRepository.existsById(id)){
            clientRepository.deleteById(id);
            return;
        }else
            return;
    }
}
