package com.seleniumexpress.address.service;

import com.seleniumexpress.address.model.Address;
import com.seleniumexpress.address.repository.AddressRepository;
import com.seleniumexpress.address.response.AddressResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressServiceImpl implements AddressService {
    @Autowired
    AddressRepository addressRepository;
    @Autowired
    ModelMapper modelMapper;

    public Address saveAddress(Address address) {
        return addressRepository.save(address);
    }

    public AddressResponse fetchAddress(Long id) {
        Optional<Address> optionalAddress = addressRepository.findById(id);
        Address address = optionalAddress.get();
        AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);
        return addressResponse;
    }

    @Override
    public AddressResponse fetchAddressByEmployeeId(Long employeeId) {
        Address addressByEmployeeId = addressRepository.getAddressByEmployeeId(employeeId);
        AddressResponse addressResponse = modelMapper.map(addressByEmployeeId, AddressResponse.class);
        return addressResponse;
    }

    public List<AddressResponse> fetchAllAddresses() {
        List<Address> addressList = addressRepository.findAll();
        List<AddressResponse> list = modelMapper.map(addressList, List.class);
        return list;
    }

}
