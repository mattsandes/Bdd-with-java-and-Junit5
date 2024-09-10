package br.com.sandes.service;

import br.com.sandes.model.Person;

import java.util.concurrent.atomic.AtomicLong;

public class PersonService implements IPersonService {

    @Override
    public Person createPerson(Person person) {

        if(person.getEmail() == null || person.getEmail().isEmpty()){
            throw new IllegalArgumentException("The person e-mail is null or empty");
        }
        Long id = new AtomicLong().incrementAndGet();
        person.setId(id);
        return person;
    }
}
