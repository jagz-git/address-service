package com.seleniumexpress.address.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    private Long id;
    private String street;
    private String locality;
    private String city;
    private String zip;
    private Long employeeId;

}

