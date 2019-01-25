package com.rohifa.subscription.services;

import com.rohifa.subscription.model.Subscription;
import reactor.core.publisher.Mono;

public interface EventService {

    Mono<String> getResponse(Subscription subscription);
}
