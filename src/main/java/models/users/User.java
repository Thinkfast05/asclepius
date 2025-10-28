package models.users;

import lombok.*;

import java.util.UUID;

@Data
public class User {
    private UUID userId;
    private String givenName;
    private String familyName;
    private String password;
    private String email;
}
