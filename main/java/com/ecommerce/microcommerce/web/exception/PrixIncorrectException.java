package com.ecommerce.microcommerce.web.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.FORBIDDEN)
public class PrixIncorrectException extends RuntimeException {
    public PrixIncorrectException(String s) {
        super(s);
    }
}
