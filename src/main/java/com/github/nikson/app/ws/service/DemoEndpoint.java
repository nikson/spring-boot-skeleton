package com.github.nikson.app.ws.service;

import com.github.nikson.demo_ws.GetPersonRequest;
import com.github.nikson.demo_ws.GetPersonResponse;
import com.github.nikson.demo_ws.Person;
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

        System.out.println("request id: " + request.getPersonId());

        Person p = new Person();
        p.setId(1);
        p.setGivenname("Nikson");
        p.setSurname("Paul");

        GetPersonResponse response = new GetPersonResponse();
        response.setPerson(p);

        return response;
    }

}
