package svg.ironhack.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import svg.ironhack.model.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
