package models.users;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import models.organizational.Department;

import java.util.UUID;

@Data
@EqualsAndHashCode(callSuper = true)
public class Employee extends User{
    private UUID employeeId;
    @ToString.Exclude // Prevents infinite loop in toString()
    @EqualsAndHashCode.Exclude // Prevents infinite loop in equals/hashCode
    private Department department;
}
