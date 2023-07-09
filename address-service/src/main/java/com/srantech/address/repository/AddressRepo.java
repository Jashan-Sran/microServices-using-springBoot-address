package com.srantech.address.repository;

import com.srantech.address.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepo extends JpaRepository<Address, Integer> {

    @Query(nativeQuery = true, value = "SELECT ea.id,ea.lane1,ea.lane2,ea.city,ea.state,ea.zip FROM microservices.address ea join microservices.employee e on e.id = ea.employee_id where ea.employee_id=1;")
    public Address findAddressByEmployeeId(@Param("employee_id") int employee_id);
}
