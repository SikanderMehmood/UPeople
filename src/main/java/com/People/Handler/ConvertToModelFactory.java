package com.People.Handler;

import com.People.Domain.DomainPerson;
import com.People.Model.PersonAuthenticatedModel;
import org.springframework.stereotype.Component;

@Component
public class ConvertToModelFactory {
    public PersonAuthenticatedModel convert(DomainPerson dbPerson) {
        return new PersonAuthenticatedModel("Sikander",dbPerson.getEmail(),dbPerson.getRole(),dbPerson.getStatus());
    }
}
