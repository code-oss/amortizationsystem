package com.code.loanapp.repository;

import java.math.BigDecimal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.code.loanapp.model.Amoset;

@Repository
public interface AmosetRepository extends JpaRepository<Amoset, Long>{

    @Query(value = "SELECT sum(loan_amt) FROM amoset")
    public BigDecimal sumLoan();

	@Query(value = "SELECT sum(total_payment) FROM amoset")
    public BigDecimal sumTotal();
}
