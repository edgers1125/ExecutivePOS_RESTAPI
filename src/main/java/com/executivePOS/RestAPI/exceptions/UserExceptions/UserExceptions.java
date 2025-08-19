package com.executivePOS.RestAPI.exceptions.UserExceptions;

public class UserExceptions {

    public static class EmailExistsException extends RuntimeException{
        public EmailExistsException(String message){
            super(message);
        }
    }

    public static class UserDoesNotExistException extends RuntimeException{
        public UserDoesNotExistException(String message){
            super(message);
        }
    }



}
