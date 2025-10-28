package models.organizational;

import lombok.Data;
import models.users.Nurse;
import models.users.Doctor;

import java.util.List;
import java.util.UUID;

@Data
public class Department {
    private UUID departmentId;
    private String name;
    private Doctor headOfDepartment;
    private List<Doctor> doctors;
    private List<Nurse> nurses;
}
