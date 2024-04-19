package svg.ironhack.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {
    private String city;
    @Column(name = "postal_code")
    private String postalCode;
    @Column(name = "street_address")
    private String streetAddress;

}
