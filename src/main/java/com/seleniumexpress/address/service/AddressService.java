package com.seleniumexpress.address.service;

import com.seleniumexpress.address.model.Address;
import com.seleniumexpress.address.response.AddressResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AddressService {

    Address saveAddress(Address address);
    AddressResponse fetchAddress(Long id);
    AddressResponse fetchAddressByEmployeeId(Long employeeId);
    List<AddressResponse> fetchAllAddresses();

}
