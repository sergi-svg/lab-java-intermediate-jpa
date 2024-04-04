package svg.ironhack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import svg.ironhack.model.Task;
import svg.ironhack.model.TaskStatus;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

    List<Task> findAllByStatus(TaskStatus status);

//    @Query("SELECT sectionId, AVG(score) FROM Grade GROUP BY sectionId ORDER BY AVG(score) ASC")
//    List<Object[]> findAverageScoreBySection();
}
