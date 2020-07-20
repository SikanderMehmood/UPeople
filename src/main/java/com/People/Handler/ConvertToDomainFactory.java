package com.People.Handler;

import com.People.Domain.DomainPerson;
import com.People.Model.ModelPerson;
import org.springframework.stereotype.Component;

@Component
public class ConvertToDomainFactory {


    public DomainPerson convert(ModelPerson modelPerson) {
        return new DomainPerson(modelPerson.getName(),modelPerson.getEmail(),modelPerson.getPassword(),modelPerson.getCollegeName(),modelPerson.isPreMedical(),modelPerson.isPreengineering(),modelPerson.getFscMarks(),modelPerson.getUniName(),modelPerson.getRole(),"Online",modelPerson.getUniList());
    }
}
