package com.kodilla.springSecurity.repository;

import com.kodilla.springSecurity.model.Message;

import java.util.List;

public interface MessageRepository {
    Message findByIndex(int index);

    List<Message> findAll();

    void save(Message message);

    void deleteByIndex(int index);

}
