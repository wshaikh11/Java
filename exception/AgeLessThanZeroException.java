package org.example.exception;

public class AgeLessThanZeroException extends Exception {
    public AgeLessThanZeroException(String message) {
        super(message);
    }
}
