package com.codenicolas.fullstack_backend.exception;

public class UserNotFoundException  extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Cold not Found The user with id" + id);
    }
}
