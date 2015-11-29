package com.github.nikson.app.beans;

import com.github.nikson.app.entity.Person;

/**
 *
 * @author Nikson
 */
public class GetPersonResponse {

    Person person;

    public GetPersonResponse() {

    }

    public GetPersonResponse(Person person) {
        this.person = person;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

}
