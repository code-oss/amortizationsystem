package com.code.loanapp.service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.code.loanapp.model.Amoset;
import com.code.loanapp.repository.AmosetRepository;

@Service
public class AmosetServiceImpl implements AmosetService {

	@Autowired
	private AmosetRepository amosetRepository;

	@Override
	public List<Amoset> getAllAmoset() {
		return amosetRepository.findAll();
	}

	@Override
	public void saveAmoset(Amoset amoset) {
		this.amosetRepository.save(amoset);
	}

	@Override
	public Amoset getAmosetById(long code) {
		Optional<Amoset> optional = amosetRepository.findById(code);
		Amoset amoset = null;
		if (optional.isPresent()) {
			amoset = optional.get();
		} else {
			throw new RuntimeException("Amortization Record not found for code :: " + code);
		}
		return amoset;
	}

	@Override
	public void deleteAmosetById(long code) {
		this.amosetRepository.deleteById(code);
	}

	@Override
	public Page<Amoset> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
		Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending() :
			Sort.by(sortField).descending();
		
		Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
		return this.amosetRepository.findAll(pageable);
	}

	@Override
	public BigDecimal sumLoan() {
		return amosetRepository.sumLoan();
	}

	@Override
	public BigDecimal sumtotal() {
		return amosetRepository.sumTotal();
	}
}
