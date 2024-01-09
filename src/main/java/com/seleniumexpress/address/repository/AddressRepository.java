package com.seleniumexpress.address.repository;

import com.seleniumexpress.address.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    @Query(nativeQuery = true, value = "SELECT ea FROM Address ea INNER JOIN Employee emp ON ea.employee_id = emp.employee_id WHERE ea.employee_id = :employeeId")
    Address getAddressByEmployeeId(@Param("employeeId") Long employeeId);

}

