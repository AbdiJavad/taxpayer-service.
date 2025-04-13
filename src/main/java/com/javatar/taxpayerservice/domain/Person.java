package com.javatar.taxpayerservice.domain;


import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.javatar.taxpayerservice.domain.data.*;
import lombok.experimental.SuperBuilder;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "person_sec")
    @SequenceGenerator(name = "person_sec", sequenceName = "person_sec", allocationSize = 1)
    private Long id;
    @Enumerated(EnumType.STRING)
    private PersonType personType;
    @Enumerated(EnumType.STRING)
    private PersonUse personUse;
    private String name;
    private String province;
    private String city;
    private String address;
    private String postalCode;
    private String phone;
    private String fax;
    private String description;

    private String nationalCode;
    private String newEconomicCode;
    private String uniqueMemoryIdentifier;
    private String registrationNo;
}
