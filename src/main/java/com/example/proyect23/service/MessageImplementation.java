package com.example.proyect23.service;

import com.example.proyect23.model.Message;
import com.example.proyect23.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MessageImplementation implements MessageService{
    @Autowired
    private MessageRepository messageRepository;
    @Override
    @Transactional
    public void create(Message message) {
        if(message.getId() != null){
            if(messageRepository.existsById(message.getId())){
                return;
            }else{
                messageRepository.save(message);
                return;
            }
        }else {
            messageRepository.save(message);
            return;
        }
    }

    @Override
    public List<Message> messages() {
        return (List<Message>) messageRepository.findAll();
    }

    @Override
    @Transactional
    public void update(Message message) {
        if (messageRepository.existsById(message.getId())){
            messageRepository.save(message);
            return;
        }else
            return;
    }

    @Override
    public void delete(Integer id) {
        if(messageRepository.existsById(id)){
            messageRepository.deleteById(id);
            return;
        }else
            return;
    }
}
