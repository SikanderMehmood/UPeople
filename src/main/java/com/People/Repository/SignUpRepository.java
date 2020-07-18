package com.People.Repository;


import com.People.Domain.DomainPerson;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface SignUpRepository extends MongoRepository<DomainPerson, String> {

    @Query("{$and:[{'email':?0},{'password':?1}]}")
    DomainPerson findPerson(String email, String password);
}
