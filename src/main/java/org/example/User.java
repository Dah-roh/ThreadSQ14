package org.example;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private String email;
    private String fullName;
    //default login password
    private String password = "09dgdg56";
    private Status verificationStatus = Status.ZERO;


}
