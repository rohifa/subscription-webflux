package com.rohifa.subscription.services;

import com.rohifa.subscription.model.Subscription;
import reactor.core.publisher.Flux;

public interface SubscriptionService {
    Flux<String> save(Subscription request);
}
