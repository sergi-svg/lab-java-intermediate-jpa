package svg.ironhack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private String company;
    @AttributeOverrides({
            @AttributeOverride(name="firstName", column = @Column(name = "first_name")),
            @AttributeOverride(name="lastName", column = @Column(name = "last_name")),
            @AttributeOverride(name="middleName", column = @Column(name = "middle_name")),
    })
    @Embedded
    private Name name;

}
