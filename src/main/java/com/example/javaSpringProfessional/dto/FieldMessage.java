package com.example.javaSpringProfessional.dto;

public class FieldMessage {

    String fieldMessage;
    String message;

    public FieldMessage(String fieldMessage, String message) {
        this.fieldMessage = fieldMessage;
        this.message = message;
    }

    public String getFieldMessage() {
        return fieldMessage;
    }

    public String getMessage() {
        return message;
    }
}
