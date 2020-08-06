package com.kodilla.springSecurity.service;

import com.kodilla.springSecurity.repository.MessageRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageServiceConfiguration {

    @Bean
    MessageService messageService(MessageRepository messageRepository) {
        return new MessageServiceImpl(messageRepository);
    }

}
