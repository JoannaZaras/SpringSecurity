package com.kodilla.springSecurity.model;


import lombok.Value;

@Value(staticConstructor = "of")
public class Message {
    String contents;
}
