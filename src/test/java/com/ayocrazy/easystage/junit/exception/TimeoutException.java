package com.ayocrazy.easystage.junit.exception;

public class TimeoutException extends RuntimeException {
    public TimeoutException(String description) {
        super(description);
    }
}
