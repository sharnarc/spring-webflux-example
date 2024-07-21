package com.autoconfig.example.test.demo.repository;

import com.autoconfig.example.test.demo.entity.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface UserRepository extends ReactiveCrudRepository<User, Long> {

}
