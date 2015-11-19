package com.github.nikson.app.beans;

/**
 *
 * @author Nikson
 */
public class GetPersonRequest {

    long id;

    public GetPersonRequest(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
