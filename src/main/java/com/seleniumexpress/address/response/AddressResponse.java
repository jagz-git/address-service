package com.seleniumexpress.address.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressResponse {
    private Long addressId;
    private String street;
    private String locality;
    private String city;
    private String zip;
    private Long employeeId;
}
