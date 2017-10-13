package com.ibs.pg.java.demo;

public class BadRequest extends RuntimeException {
    public BadRequest(String message) {
        super(message);
    }
}
