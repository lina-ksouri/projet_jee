package com.example.projet_jee;

import com.example.projet_jee.exception.ReservationNotFoundException;
import com.example.projet_jee.exception.UserNotFoundException;
import com.example.projet_jee.exception.chambreNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class handlerException {
    @ExceptionHandler(UserNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String clientNotFoundHandler(UserNotFoundException ex){
        return ex.getMessage();
    }
    @ExceptionHandler(ReservationNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String ResNotFoundHandler(ReservationNotFoundException ex){
        return ex.getMessage();
    }
    @ExceptionHandler(chambreNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String chambreNotFoundHandler(chambreNotFoundException ex){
        return ex.getMessage();
    }
}
