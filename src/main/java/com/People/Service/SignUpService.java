package com.People.Service;

import com.People.Domain.DomainPerson;
import com.People.Repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SignUpService {
    @Autowired
    private SignUpRepository signUpRepository;

    public SignUpService(SignUpRepository signUpRepository) {
        this.signUpRepository = signUpRepository;
    }

    public DomainPerson saveSignUpInformation(DomainPerson domainPerson) {
        return  signUpRepository.save(domainPerson);
    }
}
