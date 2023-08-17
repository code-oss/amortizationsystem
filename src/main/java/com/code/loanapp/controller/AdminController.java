package com.code.loanapp.controller;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.integration.IntegrationProperties.RSocket.Client;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.loanapp.model.AdminModel;
import com.code.loanapp.model.Amoset;
import com.code.loanapp.model.Clients;
import com.code.loanapp.repository.AdminModelRep;
import com.code.loanapp.service.AdminModelserv;
import com.code.loanapp.service.AmosetService;
import com.code.loanapp.service.ClientService;

import jakarta.servlet.http.HttpSession;
@Controller
public class AdminController {
     @Autowired
    private AdminModelRep adminModelRep;

    @Autowired
    private AdminModelserv adminModelserv;

    @Autowired
    private AmosetService amosetService;

    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    public String LoginHome(){
        return "Enter";
    }

    @GetMapping("/home/dashboard")
    public String viewIndex(Model model) {
        List<AdminModel>adminModels= adminModelserv.getAdminModels();
        model.addAttribute("adminModels" ,adminModels);
		return "index";
	}

    @GetMapping("/Signin")
    public String Login(@RequestParam("username")String username, @RequestParam("password")String password , HttpSession
                        session, ModelMap modelMap){
        AdminModel adminModel = adminModelRep.findAdminByUsernamePassword(username,password);

        if (adminModel !=null){
            String adminUser = adminModel.getUsername();
            String adminPass = adminModel.getPassword();

            if (username.equalsIgnoreCase(adminUser) && password.equalsIgnoreCase(adminPass)){
                session.setAttribute(username, "username");
                return "redirect:/home/dashboard";
            } else {
                modelMap.put("error", "details Un recorgnised");
                return "/ErrorPa";
            }
        } else {
            modelMap.put("error", "details Un recorgnized");
            return "/ErrorPa";
        }
    }

    @GetMapping(value = "/home/logout")
	public String logout_user(HttpSession session)
	{
		session.removeAttribute("username");
		session.invalidate();
		return "redirect:/";
	}
}
