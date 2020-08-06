package com.kodilla.springSecurity.controller;

import com.kodilla.springSecurity.mapper.MessageMapper;
import com.kodilla.springSecurity.model.MessageDto;
import com.kodilla.springSecurity.service.MessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/messages")
public class MessageController {

    private final MessageService messageService;


    @DeleteMapping(path = "/{index}")
    private void m1(@PathVariable("index") int index) {
        messageService.deleteMessage(index);
    }

    @PostMapping
    private void m2(@RequestBody MessageDto messageDto) {
        messageService.saveMessage(MessageMapper.toMessage(messageDto));
    }

    @GetMapping
    private List<MessageDto> m3() {
        return MessageMapper.toMessageDtoList(messageService.findAllMessages());
    }

}
