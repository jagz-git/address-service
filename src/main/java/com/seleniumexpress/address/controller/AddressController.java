package com.seleniumexpress.address.controller;

import com.seleniumexpress.address.model.Address;
import com.seleniumexpress.address.response.AddressResponse;
import com.seleniumexpress.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    AddressService addressService;

    @GetMapping("/addresses")
    public ResponseEntity<List<AddressResponse>> fetchAllAddresses() {
        List<AddressResponse> addressList = addressService.fetchAllAddresses();
        return new ResponseEntity<>(addressList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AddressResponse> fetchAddressById(@PathVariable(value = "id") Long id) {
        AddressResponse addressResponse = addressService.fetchAddress(id);
        return new ResponseEntity<>(addressResponse, HttpStatus.OK);
    }

    @GetMapping("/emp/{employeeId}")
    public ResponseEntity<AddressResponse> fetchAddressByEmployeeId(@PathVariable(value = "employeeId") Long employeeId) {
        AddressResponse addressResponse = addressService.fetchAddressByEmployeeId(employeeId);
        return new ResponseEntity<>(addressResponse, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Address> saveAddress(@RequestBody Address address) {
        Address addressSaved = addressService.saveAddress(address);
        return new ResponseEntity<>(addressSaved, HttpStatus.OK);
    }

}
