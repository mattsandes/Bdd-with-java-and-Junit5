package br.com.sandes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import br.com.sandes.model.Person;
import br.com.sandes.service.IPersonService;
import br.com.sandes.service.PersonService;

public class PersonServiceTest {
	
	Person person;
	
	@BeforeEach
	void setUp() {
		person = new Person(
				"Keith",
				"Moon",
				"kmoon@erudio.com.br",
				"Wembley - UK",
				"Male");
	}

	@DisplayName("When create a person with success, should return a person object")
	@Test
	void testCreatePerson_WhenSeccess_ShouldReturnPersonObject() {
		
		//Given (Arrange)
		IPersonService service = new PersonService();
		
		//When (Act)
		
		Person actual = service.createPerson(person);
		
		//Then (Assert)
		//adicionando uma lambda function, a mensagem sera validada quando o test falhar;
		assertNotNull(actual, () -> "The createPerson() should not have, returned null!");
	}
	
	@DisplayName("When create a person with success, should contains firstname in returned person object")
	@Test
	void testCreatePerson_WhenSeccess_ShouldContainsFirstNameInReturnedPersonObject() {
		
		//Given (Arrange)
		IPersonService service = new PersonService();
		
		//When (Act)
		
		Person actual = service.createPerson(person);
		
		//Then (Assert)
		//adicionando uma lambda function, a mensagem sera validada quando o test falhar;
		assertEquals(person.getFirstName(), actual.getFirstName(),
				() -> "The FirstName() is Different");
	}
}
