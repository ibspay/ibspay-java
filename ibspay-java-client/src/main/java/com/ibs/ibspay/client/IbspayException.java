package com.ibs.ibspay.client;

import com.ibs.ibspay.api.ErrorResponse;

/**
 * @author York Huang
 */
public class IbspayException extends RuntimeException {
    private ErrorResponse errorResponse;

    public IbspayException(String message) {
        super(message);
    }

    public IbspayException(Throwable cause) {
        super(cause);
    }

    public IbspayException(String message, Throwable cause) {
        super(message, cause);
    }

    public IbspayException(ErrorResponse errorResponse) {
        super(errorResponse.getTitle());
    }

    public ErrorResponse getErrorResponse() {
        return errorResponse;
    }
}
