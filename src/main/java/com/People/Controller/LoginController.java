package com.People.Controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    public LoginController(){

    }

    @PostMapping(value = "/health")
    public String checkIfApplicationIsOk(){
        return "Application status GREEN";
    }


}
