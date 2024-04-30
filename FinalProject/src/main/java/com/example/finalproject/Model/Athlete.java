package com.example.finalproject.Model;

import jakarta.persistence.Entity;
import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Athlete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer athleteId ;
// @NotEmpty(message = "username should be not empty")
//    @Size(min = 4 , message = "username should be more than 4 char")
//    @Column(columnDefinition = "varchar(5) not null")
    private String username ;
//    @NotEmpty(message = "password should be not empty")
//    @Size(min = 5 , message = "password should be more than 4 char")
//    @Column(columnDefinition = "varchar(15) not null unique")
    private String password ;
//    @Email
//    @NotEmpty(message = "email should be not empty")
//    @Column(columnDefinition = "varchar(30) not null unique")
    private String email ;
//    @NotNull(message = "age should be not empty")
//    @Column(columnDefinition = "int not null ")
    private Integer age;
//    @NotNull(message = "weight should be not empty")
//    @Column(columnDefinition = "int not null ")
    private Integer weight;
//    @NotNull(message = "height should be not empty")
//    @Column(columnDefinition = "int not null ")
    private Integer height;
//    @NotEmpty(message = "gender should be not empty")
//    @Column(columnDefinition = "varchar(5) check(gender='male' or gender='female')")
    private String gender ;
//    @NotEmpty(message = "sport should be not empty")
//    @Column(columnDefinition = "varchar(5) not null ")
    private String sport ;
//    @NotEmpty(message = "category should be not empty")
//    @Column(columnDefinition = "varchar(5) not null ")
    private String category ;



}
