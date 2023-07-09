package com.srantech.address.controller;

import com.srantech.address.response.AddressResponse;
import com.srantech.address.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    @GetMapping("/{employee_id}")
    public ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable int employee_id){

        AddressResponse addressResponse = addressService.getAddressByEmployeeId(employee_id);

        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(addressResponse);
    }

}
