package com.quick.io;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.naming.Name;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProfileRequest {
    @NotNull(message = "Name should not be empty")
    private String name;
    @Email(message = "valid Email Address")
    @NotNull(message = "Email should not be empty")
    private String email;
    @Size(min = 6,message = "Password must be atleast 6 characters")
    private  String password;

}
