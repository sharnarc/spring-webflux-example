package com.autoconfig.example.test.demo.service;

import com.autoconfig.example.test.demo.entity.User;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.reactive.function.BodyInserter;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface UserService {

    Mono<User> saveUser(User user);


    Flux<User> getAllUsers();

}
