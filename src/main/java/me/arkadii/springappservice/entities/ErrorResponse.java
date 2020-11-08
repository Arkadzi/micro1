package me.arkadii.springappservice.entities;

public class ErrorResponse {
    String message;

    public ErrorResponse(String result) {
        this.message = result;
    }
}
