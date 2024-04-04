package svg.ironhack.model;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BillableTask extends Task {

    @Column(name = "hourly_rate")
    private double hourlyRate;

}
