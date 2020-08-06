package com.kodilla.springSecurity.mapper;

import com.kodilla.springSecurity.model.Message;
import com.kodilla.springSecurity.model.MessageDto;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class MessageMapper {
    public static Message toMessage(MessageDto messageDto) {
        return Message.of(messageDto.getContents());
    }

    public static MessageDto toMessageDto(Message message) {
        return new MessageDto(message.getContents());
    }

    public static List<Message> toMessageList(List<MessageDto> messageDtos) {
        return messageDtos.stream()
                .map(messageDto -> Message.of(messageDto.getContents()))
                .collect(toList());
    }

    public static List<MessageDto> toMessageDtoList(List<Message> messages) {
        return messages.stream()
                .map(message -> new MessageDto(message.getContents()))
                .collect(toList());
    }

}
