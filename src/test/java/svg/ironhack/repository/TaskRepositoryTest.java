package svg.ironhack.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import svg.ironhack.model.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaskRepositoryTest {

    @Autowired
    TaskRepository taskRepository;

    @Test
    @DisplayName("Should return all task with a concrete status")
    void testFindAllByStatus() {
        /*
        Name name1 = new Name("firstName1", "secondName1");
        Address address1 = new Address("street 1", "city1", "PC001");
        Address secondaryAddress1 = new Address("street 1", "city1", "PC001");

        Contact contact1 = new Contact();
        contact1.setName(name1);
        contact1.setAddress(address1);
        contact1.setSecondaryAddress(secondaryAddress1);

        Task task1 = new Task();
        task1.setTitle("Study JPA");
        task1.setDueDate("01/04/2024");
        task1.setStatus(TaskStatus.IN_PROGRESS);
        task1.setContact(contact1);

        Task task = taskRepository.save(task1);

        assertEquals(TaskStatus.IN_PROGRESS, task.getStatus());
        */

        assertEquals(1, taskRepository.findAllByStatus(TaskStatus.IN_PROGRESS).size());
    }
}