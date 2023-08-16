package com.code.loanapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.loanapp.model.Amoset;
import com.code.loanapp.repository.AmosetRepository;

@Service
public class AmosetAddService {
    @Autowired
    private AmosetRepository amosetRepository;


    public void saveAmosets(String c_id,String f_name,String location,String interest, String loan_amt,
                                  String no_years, String month_pay,String total_payment,String status,String amt_pend,
								  String date_e,String profit)throws Exception {
		Amoset amoset = new Amoset();
		amoset.setC_id(c_id);
		amoset.setF_name(f_name);
		amoset.setLocation(location);
		amoset.setInterest(interest);
		amoset.setLoan_amt(loan_amt);
		amoset.setNo_years(no_years);
		amoset.month_pay(month_pay);
		amoset.setTotal_payment(total_payment);
		amoset.setStatus(status);
		amoset.setAmt_pend(amt_pend);
		amoset.setDate_e(date_e);
		amoset.setProfit(profit);
		amosetRepository.save(amoset);
		}
}
