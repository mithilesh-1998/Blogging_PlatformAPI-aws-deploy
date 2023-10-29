package com.example.BloggingPlatformAPI.model.Dto;


import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignInInput {

    @Email
    private String email;
    private String password;
}
