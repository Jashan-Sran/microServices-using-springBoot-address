package com.srantech.address.service.impl;

import com.srantech.address.entity.Address;
import com.srantech.address.repository.AddressRepo;
import com.srantech.address.response.AddressResponse;
import com.srantech.address.service.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private AddressRepo addressRepo;

    @Override
    public AddressResponse getAddressByEmployeeId(int employee_id) {

        Address address = addressRepo.findAddressByEmployeeId(employee_id);

        AddressResponse addressResponse = modelMapper.map(address, AddressResponse.class);

        return addressResponse;
    }
}
