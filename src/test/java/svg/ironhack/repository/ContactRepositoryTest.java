package svg.ironhack.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import svg.ironhack.model.Address;
import svg.ironhack.model.Contact;
import svg.ironhack.model.Name;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class ContactRepositoryTest {

    @Autowired
    ContactRepository contactRepository;

    @BeforeEach
    void setUp(){
        Name name1 = new Name();
        name1.setFirstName("firstName1");
        name1.setLastName("secondName1");

        Address address1 = new Address();
        address1.setStreetAddress("street 1");
        address1.setCity("city1");
        address1.setPostalCode("PC001");

        Address secondaryAddress1 = new Address();
        secondaryAddress1.setStreetAddress("street 1");
        secondaryAddress1.setCity("city1");
        secondaryAddress1.setPostalCode("PC001");

        Contact contact1 = new Contact();
        contact1.setName(name1);
        contact1.setAddress(address1);
        contact1.setSecondaryAddress(secondaryAddress1);

        contactRepository.save(contact1);
    }

    @Test
    void testFindAll() {
        assertTrue(contactRepository.findAll().size() > 0);
    }

    @Test
    void testFindById() {
        assertTrue(contactRepository.findById(1).isPresent());
    }

    @Test
    void testFindByFirstName() {
        assertTrue(contactRepository.findByNameFirstName("firstName1").size() > 0);
    }

}
