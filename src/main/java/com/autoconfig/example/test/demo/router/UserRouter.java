package com.autoconfig.example.test.demo.router;

import com.autoconfig.example.test.demo.handler.UserHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class UserRouter {
    @Bean
    public RouterFunction<ServerResponse> projectRouterFunction(UserHandler userHandler) {
        return RouterFunctions.route()
            .POST("/api/user", userHandler::createUser)
            .POST("/api/users", userHandler::createUsers)
            .GET("/api/user/{userid}", userHandler::getUserByUserId)
            .GET("/api/users", userHandler::getAllUsers)
            .PUT("/api/user/{userid}", userHandler::updateUser)
            .build();
    }

}
