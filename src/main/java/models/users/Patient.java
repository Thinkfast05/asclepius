package models.users;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
public class Patient extends User {
    private UUID patientId;
    private LocalDate dateOfBirth;
}