package com.ibs.ibspay.client;

import com.ibs.ibspay.common.model.BaseModel;

import java.util.List;

/**
 * @author York Huang
 */
public class ErrorResponse extends BaseModel {
    private int status;
    private String title;
    private String detail;
    private List<InvalidField> errors;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public List<InvalidField> getErrors() {
        return errors;
    }

    public void setErrors(List<InvalidField> errors) {
        this.errors = errors;
    }

    public static class InvalidField {
        private String field;
        private Object rejected;
        private String message;

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public Object getRejected() {
            return rejected;
        }

        public void setRejected(Object rejected) {
            this.rejected = rejected;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

}
