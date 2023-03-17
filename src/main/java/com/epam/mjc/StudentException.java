package com.epam.mjc;

public class StudentException extends IllegalArgumentException{
    String message;
    public StudentException(String message) {
        super(message);
    }
}
