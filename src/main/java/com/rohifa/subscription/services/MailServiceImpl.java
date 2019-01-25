package com.rohifa.subscription.services;

import com.rohifa.subscription.model.Subscription;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class MailServiceImpl implements MailService {

    @Override
    public Mono<String> getResponse(Subscription subscription) {
        return Mono.just("OK");
    }
}
