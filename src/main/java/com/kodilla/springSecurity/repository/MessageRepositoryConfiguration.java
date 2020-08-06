package com.kodilla.springSecurity.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class MessageRepositoryConfiguration {

    @Bean
    MessageRepository messageRepository() {
        return new InMemoryMessageRepository();
    }
}
