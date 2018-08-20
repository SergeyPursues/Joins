package com.example.JoinTables.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.JoinTables.Pojos.Customer;
import com.fasterxml.jackson.core.sym.Name;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
