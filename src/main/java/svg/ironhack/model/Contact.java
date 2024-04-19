package svg.ironhack.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Embedded
    private Name name;
    @Embedded
    private Address address;

    @AttributeOverrides({
            @AttributeOverride(name="city", column = @Column(name = "secondary_city")),
            @AttributeOverride(name="postalCode", column = @Column(name = "secondary_postal_code")),
            @AttributeOverride(name="streetAddress", column = @Column(name = "secondary_street_address"))
    })
    @Embedded
    private Address secondaryAddress;

    @OneToMany(mappedBy = "contact")
    private List<Task> tasks;

}
