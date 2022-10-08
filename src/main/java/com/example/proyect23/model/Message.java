package com.example.proyect23.model;

import javax.persistence.*;

@Entity
@Table(name = "message")
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String messagetext;

    public Message() {
    }

    public Message(Integer id, String messagetext) {
        this.id = id;
        this.messagetext = messagetext;
    }

    public Message(String messagetext) {
        this.messagetext = messagetext;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessagetext() {
        return messagetext;
    }

    public void setMessagetext(String messagetext) {
        this.messagetext = messagetext;
    }
}
