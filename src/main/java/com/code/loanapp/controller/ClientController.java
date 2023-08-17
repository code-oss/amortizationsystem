package com.code.loanapp.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.code.loanapp.model.Amoset;
import com.code.loanapp.model.Clients;
import com.code.loanapp.service.AmosetAddService;
import com.code.loanapp.service.AmosetService;
import com.code.loanapp.service.ClientService;

@Controller
public class ClientController {

	@Autowired
	private ClientService clientService;

	@Autowired
	private AmosetService amosetService;

	@Autowired
	private AmosetAddService amosetAddService;
	
	@GetMapping("/home/viewClients")
	public String viewHomePage(Model model) {
		return findPaginated(1, "id", "asc", model);		
	}
	
	@GetMapping("/home/addClient")
	public String showNewClientForm(Model model) {
		Clients client = new Clients();
		model.addAttribute("client", client);
		return "AddClient";
	}
	
	@PostMapping("/saveClient")
	public String saveClient(@ModelAttribute("client") Clients client) {
		clientService.saveClient(client);
		return "redirect:/home/viewClients";
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable ( value = "id") long id, Model model) {
		

		Clients client = clientService.getClientById(id);

		model.addAttribute("client", client);
		return "UpdateClient";
	}

	@GetMapping("/clientView/{id}")
	public String showClient(@PathVariable ( value = "id") long id, Model model) {
		

		Clients client = clientService.getClientById(id);

		model.addAttribute("client", client);
		return "ViewClient";
	}
	
	@GetMapping("/deleteClient/{id}")
	public String deleteClient(@PathVariable (value = "id") long id) {
		
		this.clientService.deleteClientById(id);
		return "redirect:/home/viewClients";
	}
	
	
	@GetMapping("/page/{pageNo}")
	public String findPaginated(@PathVariable (value = "pageNo") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 10;
		
		Page<Clients> page = clientService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Clients> listClients = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("listClients", listClients);
		return "ClientData";
	}
	

	@GetMapping("/pages/{pageNos}")
	public String findPaginated1(@PathVariable (value = "pageNo") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 10;
		
		Page<Clients> page = clientService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Clients> listClients = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("listClients", listClients);
		return "/AmortizationSettings";
	}
	@GetMapping("/pages1/{pageNos1}")
	public String findPaginated2(@PathVariable (value = "pageNos1") int pageNo, 
			@RequestParam("sortField") String sortField,
			@RequestParam("sortDir") String sortDir,
			Model model) {
		int pageSize = 10;
		
		Page<Amoset> page = amosetService.findPaginated(pageNo, pageSize, sortField, sortDir);
		List<Amoset> listAmosets = page.getContent();
		
		model.addAttribute("currentPage", pageNo);
		model.addAttribute("totalPages", page.getTotalPages());
		model.addAttribute("totalItems", page.getTotalElements());
		
		model.addAttribute("sortField", sortField);
		model.addAttribute("sortDir", sortDir);
		model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
		
		model.addAttribute("listAmosets", listAmosets);
		return "/AmortizationData";
	}

	//amortization settings

	@GetMapping("/home/amosetting")
	public String viewAmoset(Model model) {
		return findPaginated1(1, "id", "asc", model);		
	}
	@GetMapping("/home/amo_settings_data")
	public String viewAmoset_data(Model model) {
		return findPaginated2(1, "code", "asc", model);		
	}

	@PostMapping("/saveAmoset")
    public String saveAmoset(@RequestParam("c_id") String c_id,
            @RequestParam("f_name") String f_name,@RequestParam("location") String location,
            @RequestParam("interest") String interest, @RequestParam("loan_amt") String loan_amt,
            @RequestParam("no_years") String no_years, @RequestParam("month_pay") String month_pay,
			@RequestParam("total_payment") String total_payment, @RequestParam("status") String status,
			@RequestParam("amt_pend") String amt_pend, @RequestParam("date_e") String date_e,
			@RequestParam("profit") String profit
			) throws Exception {
        amosetAddService.saveAmosets(c_id,f_name,location,interest,loan_amt,no_years,month_pay,total_payment,status,
		amt_pend,date_e,profit);
        return "AmortizationSettings";
    }

	@GetMapping("/showFormForLoanUpdate/{id}")
	public String showFormForLoanUpdate(@PathVariable ( value = "id") long id, Model model) {
		

		Clients client = clientService.getClientById(id);

		model.addAttribute("client", client);
		return "AmortizationCalc";
	}


	@GetMapping("/AmosetView/{code}")
	public String showAmoset(@PathVariable ( value = "code") long code, Model model) {
		

		Amoset amoset = amosetService.getAmosetById(code);

		model.addAttribute("amoset", amoset);
		return "ViewAmoset";
	}
	@GetMapping("/deleteAmoset/{code}")
	public String deleteAmoset(@PathVariable (value = "code") long code) {
		
		this.amosetService.deleteAmosetById(code);
		return "redirect:/";
	}

	
}
