package com.People.Handler;

import com.People.Model.Person;
import com.People.Service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpHandler {

    @Autowired
    private SignUpService signUpService;
    @Autowired
    private ConvertToDomainFactory convertToDomainFactory;

    public String saveSignUpInformation(Person person) {
        com.People.Domain.Person p1 =  signUpService.saveSignUpInformation(convertToDomainFactory.convert(person));
         System.out.println(p1);
         return "OK";
    }
}
