package com.rohifa.subscription.controllers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
public @Data class SubscriptionRequest {

    private String email;
    private String firstName;
    private String gender;
    private String dateOfBirth;
    private Boolean flag;


}
