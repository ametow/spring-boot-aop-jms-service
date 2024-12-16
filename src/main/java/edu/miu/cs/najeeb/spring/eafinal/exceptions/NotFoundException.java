package edu.miu.cs.najeeb.spring.eafinal.exceptions;

public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
