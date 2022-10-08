package com.example.proyect23.repository;

import com.example.proyect23.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepository extends CrudRepository<Message, Integer> {
}
