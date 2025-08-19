package com.executivePOS.RestAPI.exceptions.UserExceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptions {
    @ExceptionHandler(UserExceptions.EmailExistsException.class)
    public ResponseEntity<String> handleEmailExists(UserExceptions.EmailExistsException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.CONFLICT);
    }

    @ExceptionHandler(UserExceptions.UserDoesNotExistException.class)
    public ResponseEntity<String> handleEmailExists(UserExceptions.UserDoesNotExistException exception){
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
    }
}
