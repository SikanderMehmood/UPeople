package com.People.Controller;

import com.People.Handler.SignUpHandler;
import com.People.Model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(value = "/signup")
public class SignUpController {

    @Autowired
    private SignUpHandler signUpHandler;

    @PostMapping("/new")
    public String saveNewPerson(@Valid @RequestBody Person person) {
         return  signUpHandler.saveSignUpInformation(person);
    }
}
