package com.rohifa.subscription.repositories;

import com.rohifa.subscription.model.Subscription;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface SubscriptionRepository extends ReactiveMongoRepository<Subscription, String> {

    Mono<Subscription> save(Subscription subscription);

}
