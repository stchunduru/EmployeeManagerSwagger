package com.stchunduru.employeemanager.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String str) {
         super(str);
    }
}
