package com.github.nikson.app.ws.service;

import com.github.nikson.app.beans.GetPersonRequest;
import com.github.nikson.app.beans.GetPersonResponse;
import com.github.nikson.app.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

/**
 *
 * @author Nikson
 */
@Endpoint
public class DemoEndpoint {

    private static final String NAMESPACE_URI = "http://github.com/nikson/demo-ws";

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getPersonRequest")
    @ResponsePayload
    public GetPersonResponse getPerosn(@RequestPayload GetPersonRequest request) {

        System.out.println("request id: " + request.getId());

        Person p = new Person(1, "test", "test");

        GetPersonResponse response = new GetPersonResponse(p);

        return response;
    }

}
