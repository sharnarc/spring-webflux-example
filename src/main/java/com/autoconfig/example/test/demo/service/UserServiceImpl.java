package com.autoconfig.example.test.demo.service;

import com.autoconfig.example.test.demo.entity.User;
import com.autoconfig.example.test.demo.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Override
    public Mono<User> saveUser(User user) {
        System.out.println("Saving user: " + user.getFirstName() + " " + user.getLastName());
        return userRepository.save(user);
    }


    @Override
    public Flux<User> getAllUsers() {
        return userRepository.findAll();
    }

}
