package com.code.loanapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.code.loanapp.model.AdminModel;
import com.code.loanapp.repository.AdminModelRep;

@Service
public class AdminModelserv {
    @Autowired
    private AdminModelRep adminModelRep;

     public List<AdminModel>getAdminModels(){
        return adminModelRep.findAll();
    }
}
