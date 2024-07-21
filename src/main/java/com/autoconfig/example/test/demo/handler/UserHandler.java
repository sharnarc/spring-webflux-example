package com.autoconfig.example.test.demo.handler;

import com.autoconfig.example.test.demo.entity.User;
import com.autoconfig.example.test.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Configuration
@RequiredArgsConstructor
@Slf4j
public class UserHandler {

    private final UserService userService;

    public Mono<ServerResponse> createUser(ServerRequest serverRequest) {

        Mono<User> userMono = serverRequest.bodyToMono(User.class);
        return ServerResponse.ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(userMono.flatMap(userService::saveUser), User.class);
    }


    public Mono<ServerResponse> getUserByUserId(ServerRequest serverRequest) {

        return null;
    }


    public Mono<ServerResponse> updateUser(ServerRequest serverRequest) {

        return null;
    }


    public Mono<ServerResponse> createUsers(ServerRequest serverRequest) {
        return null;
    }


    public Mono<ServerResponse> getAllUsers(ServerRequest serverRequest) {
        return ServerResponse.ok().body(userService.getAllUsers(), User.class);
    }

}
