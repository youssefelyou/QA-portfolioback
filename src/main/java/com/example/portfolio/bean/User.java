package com.example.portfolio.bean;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @OneToMany(mappedBy = "user")
    private List<Language> languages;
    @OneToMany(mappedBy = "user")
    private List<Experience> experiences;
    @OneToMany(mappedBy = "user")
    private List<Formation> formations;
    @OneToMany(mappedBy = "user")
    private List<Skills> skillsList;

}
