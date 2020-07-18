package com.People.Handler;

import com.People.Domain.Person;
import org.springframework.stereotype.Component;

@Component
public class ConvertToDomainFactory {


    public Person convert(com.People.Model.Person person) {

        return new Person(person.getEmail(),person.getPassword(),person.getRole(),"ONLINE");
    }
}
