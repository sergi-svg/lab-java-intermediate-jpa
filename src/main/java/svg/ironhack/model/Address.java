package svg.ironhack.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {
    @Column(name = "street_address")
    private String streetAddress;
    private String city;
    @Column(name = "postal_code")
    private String postalCode;

}
