package com.rohifa.subscription.controllers;

import com.rohifa.subscription.model.Subscription;
import com.rohifa.subscription.services.SubscriptionService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import javax.validation.Valid;

@RestController
@Slf4j
public class SubscriptionController {

    private SubscriptionService service;

    public SubscriptionController(SubscriptionService service) {
        this.service = service;
    }


    @PostMapping("/subscribe")
    @ApiOperation(value = "Subscribe a user to the newsletter", response = String.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully subscribed"),
    })
    public Flux<String> subscribe(@RequestBody @Valid Subscription subscription) {

        return service.save(subscription);

    }
}
