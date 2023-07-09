package com.srantech.address.service;

import com.srantech.address.response.AddressResponse;

public interface AddressService {

    public AddressResponse getAddressByEmployeeId(int employeeId);
}
