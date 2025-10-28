package models.medical;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Presciption {
    private String prescriptionId;
    private String patientId;
    private String doctorId;
    private String medication;
    private String dosage;
    private String frequency;
    private LocalDate issueDate;
}
