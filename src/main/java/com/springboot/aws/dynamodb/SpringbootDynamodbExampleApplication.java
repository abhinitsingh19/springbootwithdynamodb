package com.springboot.aws.dynamodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import com.springboot.aws.dynamodb.entity.Person;
import com.springboot.aws.dynamodb.repository.PersonRepository;

@SpringBootApplication
@RestController
public class SpringbootDynamodbExampleApplication {

    @Autowired
    private PersonRepository repository;

    @PostMapping("/savePerson")
    public Person savePerson(@RequestBody Person person) {
        return repository.addPerson(person);
    }


    @GetMapping("/getPerson/{personId}")
    public Person findPerson(@PathVariable String personId) {
        return repository.findPersonByPersonId(personId);
    }

    @DeleteMapping("/deletePerson")
    public String deletePerson(@RequestBody Person person) {
        return repository.deletePerson(person);
    }

    @PutMapping("/editPerson")
    public String updatePerson(@RequestBody Person person) {
        return repository.editPerson(person);
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDynamodbExampleApplication.class, args);
    }

}
