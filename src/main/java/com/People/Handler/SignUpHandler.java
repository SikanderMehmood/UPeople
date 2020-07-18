package com.People.Handler;

import com.People.Domain.DomainPerson;
import com.People.Model.ModelPerson;
import com.People.Service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SignUpHandler {

    @Autowired
    private SignUpService signUpService;
    @Autowired
    private ConvertToDomainFactory convertToDomainFactory;

    public String saveSignUpInformation(ModelPerson modelPerson) {
        DomainPerson p1 =  signUpService.saveSignUpInformation(convertToDomainFactory.convert(modelPerson));
         System.out.println(p1);
         return "OK";
    }
}
