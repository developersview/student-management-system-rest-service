package com.developersview.StudentManagementSystem.Exception;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**
 * @author pranoy.chakraborty
 * @Date 17/07/22
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @Value("${data.exception.message1}")
    private String message1;

    @ExceptionHandler(UserAlreadyExistsException.class)
    public ResponseEntity<String> UserAlreadyExistsException(UserAlreadyExistsException userAlreadyExistsException) {
        return new ResponseEntity<>(message1, HttpStatus.CONFLICT);
    }

    @Value("${data.exception.message2}")
    private String message2;

    @ExceptionHandler(UserNotFoundException.class)
    public ResponseEntity<String> UserNotFoundException(UserNotFoundException userNotFoundException) {
        return new ResponseEntity<>(message2, HttpStatus.NOT_FOUND);
    }
}
