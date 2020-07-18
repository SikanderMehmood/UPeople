package com.People.Handler;

import com.People.Domain.DomainPerson;
import com.People.Model.ModelPerson;
import org.springframework.stereotype.Component;

@Component
public class ConvertToDomainFactory {


    public DomainPerson convert(ModelPerson modelPerson) {

        return new DomainPerson(modelPerson.getEmail(), modelPerson.getPassword(), modelPerson.getRole(),"ONLINE");
    }
}
