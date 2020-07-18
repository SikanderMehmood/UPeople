package com.People.Controller;


import com.People.Handler.LoginHandler;
import com.People.Model.PersonAuthenticatedModel;
import com.People.Model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/login")
public class LoginController {

    @Autowired
    private LoginHandler loginHandler;

    public LoginController() {
    }

    @PostMapping(value = "/health")
    public String checkIfApplicationIsOk() {
        return "Application status GREEN";
    }

    @GetMapping(value = "/personLogin")
    public PersonAuthenticatedModel getPerson(@RequestBody UserModel userModel) {
        return loginHandler.getPersonModelIfExist(userModel);
    }


}
