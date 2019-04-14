package com.webmvcapp.services;

import java.util.List;
import java.util.Optional;

import com.webmvcapp.domain.Person;

public interface PersonService {

    Person findById(String id);

    List<Person> findAll();

    Person save(Person person);

    Person update(Person person);

    void deleteById(String id);
}
