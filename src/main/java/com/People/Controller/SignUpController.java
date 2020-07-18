package com.People.Controller;

import com.People.Model.Person;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
@RequestMapping(value = "demo")
public class SignUpController {

    public SignUpController() {

    }

    @PostMapping("/new")
    public Person saveNewPerson(@Valid @RequestBody Person person) {
        return person;
    }
}
