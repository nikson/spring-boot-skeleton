package com.github.nikson.app.controllers;

import com.github.nikson.app.beans.Response;
import com.github.nikson.app.dao.PersonDao;
import com.github.nikson.app.entity.Person;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nikson
 */
@RestController
@RequestMapping(value = "api/")
@Api(value = "api/")
public class RootController {

    @Autowired
    PersonDao personDao;

    @ApiOperation(value = "Test", nickname = "Test", response = Person.class)
    @RequestMapping(value = "test1")
    public Person index() {
        Person p = new Person(1, "Nikson", "Paul");

        return p;
    }

    @ApiOperation(value = "Save Person", notes = "Save person information to db", response = Response.class)
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public Response test(@RequestBody Person personBean) {

        Response response = new Response();

        Person p = personDao.save(personBean);
        response.setStatus("OK");
        response.setData(p);

        return response;
    }

    @ApiOperation(value = "Get Perosn", notes = "Get person information", response = Response.class)
    @RequestMapping(value = "get/{id}", method = RequestMethod.GET)
    public Response test(@PathVariable("id") long personId) {

        Response response = new Response();

        System.out.println("person id: " + personId);

        Person p = personDao.findOne(personId);
        response.setStatus("OK");
        response.setData(p);

        return response;
    }

}
