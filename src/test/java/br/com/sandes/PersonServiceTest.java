package br.com.sandes;

import br.com.sandes.model.Person;
import br.com.sandes.service.IPersonService;
import br.com.sandes.service.PersonService;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class PersonServiceTest {

    Person person;

    @BeforeEach
    void setUp(){
        person = new Person(
                "Keith",
                "Moon",
                "kmoon@erudio.com.br",
                "Wembley - UK",
                "Male"
        );
    }

    @DisplayName("When create a person with success should return a person object")
    @Test
    void testCreatePerson_WhenSuccess_ShouldReturnPersonObject(){
        //Given (Arrange)
        IPersonService service = new PersonService();

        //When (Act)
        Person actual = service.createPerson(person);

        //Then (Assert)
        Assertions.assertNotNull(actual, () -> "Actual object should not return null");

        assertNotNull(person.getId());
        assertEquals("Keith", person.getName());
        assertEquals("Moon", person.getSecondName());
        assertEquals("kmoon@erudio.com.br", person.getEmail());
        assertEquals("Wembley - UK", person.getAddress());
        assertEquals("Male", person.getGender());
    }

    @DisplayName("When create a person with success should return a person object")
    @Test
    void testCreatePerson_WhenSuccess_ShouldContainsFirstNameInReturnedPersonObject(){
        //Given (Arrange)
        IPersonService service = new PersonService();

        //When (Act)
        Person actual = service.createPerson(person);

        //Then (Assert)
        assertNotNull(person.getId(), () -> "Person ID is missing");
        assertEquals(person.getName(), actual.getName(), () -> "The first name is different");
        assertEquals("Keith", person.getName());
        assertEquals("Moon", person.getSecondName());
        assertEquals("kmoon@erudio.com.br", person.getEmail());
        assertEquals("Wembley - UK", person.getAddress());
        assertEquals("Male", person.getGender());
    }

    @DisplayName("When create a person with null e-Mail should throw Exception")
    @Test
    void testCreatePerson_WithNullEmail_ShouldThrowIllegalArgumentException(){
        //Given (Arrange)
        IPersonService service = new PersonService();
        person.setEmail(null);

        //When (Act)
        Person actual = service.createPerson(person);

        //Then (Assert)
        assertThrows(IllegalArgumentException.class,
                () -> service.createPerson(person),
                () -> "Empty e-Mail should have cause an IllegalArgumentException!");
    }
}
