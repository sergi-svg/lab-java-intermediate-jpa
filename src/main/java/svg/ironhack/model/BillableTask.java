package svg.ironhack.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Entity
@DiscriminatorValue("billable")
public class BillableTask extends Task {

    @Column(name = "hourly_rate")
    private double hourlyRate;

}
