package com.ibs.pg.java;

/**
 * @author YQ.Huang
 */
public class PgException extends RuntimeException {
    public PgException(String message) {
        super(message);
    }

    public PgException(Throwable cause) {
        super(cause);
    }

    public PgException(String message, Throwable cause) {
        super(message, cause);
    }
}
