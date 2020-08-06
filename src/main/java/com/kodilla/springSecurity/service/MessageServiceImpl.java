package com.kodilla.springSecurity.service;

import com.kodilla.springSecurity.model.Message;
import com.kodilla.springSecurity.repository.MessageRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    @Override
    public Message findMessage(int index) {
        return messageRepository.findByIndex(index);
    }

    @Override
    public List<Message> findAllMessages() {
        return messageRepository.findAll();
    }

    @Override
    public void saveMessage(Message message) {
        messageRepository.save(message);
    }

    @Override
    public void deleteMessage(int index) {
        messageRepository.deleteByIndex(index);
    }
}
