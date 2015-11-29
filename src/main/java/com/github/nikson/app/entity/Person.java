package com.github.nikson.app.entity;

/**
 *
 * @author Nikson
 */
public class Person {

    private long id;
    private String givenname;
    private String surname;

    public Person(){}
    
    public Person(long id, String givenname, String surname) {
        this.id = id;
        this.givenname = givenname;
        this.surname = surname;
    }

    public long getId() {
        return id;
    }
    
    public void setId(long id){
        this.id = id;
    }

    public String getGivenname() {
        return givenname;
    }

    public void setGivenname(String givenname) {
        this.givenname = givenname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    
    
    
}
