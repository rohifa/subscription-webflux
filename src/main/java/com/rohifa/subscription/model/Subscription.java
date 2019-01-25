package com.rohifa.subscription.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;

@Document
@NoArgsConstructor
@AllArgsConstructor
@Builder
public @Data class Subscription {

    @Id
    private String id;

    @NotNull
    private String email;
    private String firstName;
    private String gender;
    @NotNull
    private String dateOfBirth;
    @NotNull
    @AssertTrue
    private Boolean flag;
    @NotNull
    private String newsletterId;

}
