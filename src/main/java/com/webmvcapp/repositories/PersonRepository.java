package com.webmvcapp.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.webmvcapp.domain.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, String> {
}
