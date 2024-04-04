package svg.ironhack.repository;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import svg.ironhack.model.Task;
import svg.ironhack.model.TaskStatus;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TaskRepositoryTest {

    @Autowired
    TaskRepository taskRepository;

    @Test
    @DisplayName("Should return all task with a concrete status")
    void testFindAllByStatus() {
        taskRepository.save(new Task(1, "Study JPA", "01/04/2024", TaskStatus.IN_PROGRESS));
        taskRepository.save(new Task(2, "Study JPQL", "01/04/2024", TaskStatus.IN_PROGRESS));

        assertEquals(2, taskRepository.findAllByStatus(TaskStatus.IN_PROGRESS).size());
    }
}