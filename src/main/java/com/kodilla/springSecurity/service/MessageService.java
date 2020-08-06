package com.kodilla.springSecurity.service;

import com.kodilla.springSecurity.model.Message;

import java.util.List;

public interface MessageService {

    Message findMessage(int index);
    List<Message> findAllMessages();
    void saveMessage(Message message);
    void deleteMessage(int index);
}
