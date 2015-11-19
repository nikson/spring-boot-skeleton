package com.github.nikson.app.controllers;

import com.github.nikson.app.entity.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nikson
 */

@RestController
public class RootController {

    @RequestMapping("/test")
    public Person index() {
        Person p = new Person(1, "Nikson", "Paul");

        return p;
    }

}
