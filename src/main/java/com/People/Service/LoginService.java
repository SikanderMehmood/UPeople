package com.People.Service;


import com.People.Domain.DomainPerson;
import com.People.Model.UserModel;
import com.People.Repository.SignUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;


@Component
public class LoginService {

    @Autowired
     public SignUpRepository signUpRepository;

    public DomainPerson getPersonFromDb(UserModel userModel){

        //Query query=new Query();
       // query.addCriteria(Criteria.where("email").is(userModel.getEmail()).and("password").is(userModel.getPassword()));
        return signUpRepository.findPerson(userModel.getEmail(),userModel.getPassword());
    }

}
