package com.example.projet_jee.exception;

public class ReservationNotFoundException extends RuntimeException {
    public ReservationNotFoundException(String s) {
        super(s);
    }
}
