package com.kodilla.springSecurity.repository;

import com.kodilla.springSecurity.model.Message;

import java.util.ArrayList;
import java.util.List;

class InMemoryMessageRepository implements MessageRepository {
    private List<Message> messages = new ArrayList<>();


    @Override
    public Message findByIndex(int index) {
        return messages.get(index);
    }

    @Override
    public List<Message> findAll() {
        return messages;
    }

    @Override
    public void save(Message message) {
        messages.add(message);
    }

    @Override
    public void deleteByIndex(int index) {
        messages.remove(index);
    }
}
