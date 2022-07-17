package com.developersview.StudentManagementSystem.Exception;

/**
 * @author pranoy.chakraborty
 * @Date 17/07/22
 */
public class UserAlreadyExistsException extends RuntimeException {
    private String message;

    public UserAlreadyExistsException() {
    }

    public UserAlreadyExistsException(String message) {
        super();
        this.message = message;
    }
}
