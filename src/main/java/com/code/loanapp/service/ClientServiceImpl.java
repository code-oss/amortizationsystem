package com.code.loanapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.code.loanapp.model.Clients;
import com.code.loanapp.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;

	@Override
	public List<Clients> getAllClients() {
		return clientRepository.findAll();
	}

	@Override
	public void saveClient(Clients client) {
		this.clientRepository.save(client);
	}

	@Override
	public Clients getClientById(long id) {
		Optional<Clients> optional = clientRepository.findById(id);
		Clients client = null;
		if (optional.isPresent()) {
			client = optional.get();
		} else {
			throw new RuntimeException(" Client not found for id :: " + id);
		}
		return client;
	}

	@Override
	public void deleteClientById(long id) {
		this.clientRepository.deleteById(id);
	}

	@Override
	public Page<Clients> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.clientRepository.findAll(pageable);
	}
}
