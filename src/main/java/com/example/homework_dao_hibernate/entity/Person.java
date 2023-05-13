package com.example.homework_dao_hibernate.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "PERSONS")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;

    @Column(length = 20, nullable = false)
    private String surname;

    @Min(0)
    @Column()
    private int age;

    @Column(length = 10, nullable = false, name = "phone_number")
    private String phoneNumber;


    @Column(nullable = false, name = "city_of_living", length = 30)
    private String city;
}
