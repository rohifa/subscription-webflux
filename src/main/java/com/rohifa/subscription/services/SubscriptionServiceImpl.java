package com.rohifa.subscription.services;

import com.rohifa.subscription.model.Subscription;
import com.rohifa.subscription.repositories.SubscriptionRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    private SubscriptionRepository repository;
    private EventService eventService;
    private MailService mailService;

    public SubscriptionServiceImpl(SubscriptionRepository repository, EventService eventService, MailService mailService) {
        this.repository = repository;
        this.eventService = eventService;
        this.mailService = mailService;
    }

    @Override
    public Flux<String> save(Subscription subscription) {
        Mono<String> mono1 = eventService.getResponse(subscription);
        Mono<String> mono2 = mailService.getResponse(subscription);
        Mono<Subscription> saved = repository.save(subscription);
        Mono<String> mono3 = saved.flatMap(it -> Mono.just(it.getId()));
        Flux<String> concat = Flux.concat(Flux.merge(mono1, mono2), mono3);
        return concat.takeLast(1);
    }
}
