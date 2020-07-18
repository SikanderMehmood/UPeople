package com.People.Repository;


import com.People.Domain.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SignUpRepository extends MongoRepository<Person, String> {
}
