package com.developersview.StudentManagementSystem.Exception;

/**
 * @author pranoy.chakraborty
 * @Date 17/07/22
 */
public class UserNotFoundException extends RuntimeException {
    private String message;

    public UserNotFoundException() {
    }

    public UserNotFoundException(String message) {
        super();
        this.message = message;
    }
}
