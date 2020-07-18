package com.People.Handler;

import com.People.Domain.DomainPerson;
import com.People.Model.ModelPerson;
import com.People.Model.PersonAuthenticatedModel;
import com.People.Model.UserModel;
import com.People.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.UnknownServiceException;

@Component
public class LoginHandler {

    @Autowired
    private LoginService loginService;
    @Autowired
    private ConvertToModelFactory convertToModelFactory;


    public PersonAuthenticatedModel getPersonModelIfExist(UserModel userModel){

        DomainPerson dbPerson = loginService.getPersonFromDb(userModel);
        return dbPerson==null? null: convertToModelFactory.convert(dbPerson);
    }
}
