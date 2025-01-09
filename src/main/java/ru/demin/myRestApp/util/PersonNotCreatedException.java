package ru.demin.myRestApp.util;

public class PersonNotCreatedException extends RuntimeException{

    public PersonNotCreatedException(String message) {
        super(message);
    }
}
