package br.com.sandes.service;

import br.com.sandes.model.Person;

public class PersonService implements IPersonService {

    @Override
    public Person createPerson(Person person) {
        return person;
    }
}
