package com.autoconfig.example.test.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Builder
@Getter
@Setter
@AllArgsConstructor
@Table("users")
public class User {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
}
