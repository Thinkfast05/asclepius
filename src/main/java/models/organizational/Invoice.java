package models.organizational;

import lombok.Data;

@Data
public class Invoice {
    private String invoiceId;
    private String patientId;
    private String appointmentId;
    private double amount;
    private boolean isPaid;
}
