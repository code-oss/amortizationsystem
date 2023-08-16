package com.code.loanapp.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.code.loanapp.model.Clients;

public interface ClientService {
	List<Clients> getAllClients();
	void saveClient(Clients client);
	Clients getClientById(long id);
	void deleteClientById(long id);
	Page<Clients> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
