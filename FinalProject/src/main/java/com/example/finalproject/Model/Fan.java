package com.example.finalproject.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Fan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fanId ;
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
//    @NotEmpty(message = "favorite Sport should be not empty")
//    @Column(columnDefinition = "varchar(5) not null ")
    private String favoriteSport ;

}
