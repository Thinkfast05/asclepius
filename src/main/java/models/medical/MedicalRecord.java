package models.medical;

import lombok.Data;

@Data
public class MedicalRecord {
    private String recordId;
    private String patientId;
    private String diagnoses;
    private String treatments;
    private String allergies;
}
