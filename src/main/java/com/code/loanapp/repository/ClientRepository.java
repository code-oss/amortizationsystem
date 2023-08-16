package com.code.loanapp.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.code.loanapp.model.Clients;

@Repository
public interface ClientRepository extends JpaRepository<Clients, Long>{

    

}
