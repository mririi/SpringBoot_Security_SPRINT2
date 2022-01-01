package com.wassim.countries.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.wassim.countries.entities.Continent;
import com.wassim.countries.repos.ContinentRepository;

@Service
public class ContinentServiceImpl implements ContinentService {
	@Autowired
	ContinentRepository continentRepository;
	@Override
	public Continent saveContinent(Continent c) {
	return continentRepository.save(c);
	}
	@Override
	public Continent updateContinent(Continent c) {
	return continentRepository.save(c);
	}
	@Override
	public void deleteContinent(Continent c) {
	continentRepository.delete(c);
	}
	 @Override
	public void deleteContinentById(Long id) {
	continentRepository.deleteById(id);
	}
	@Override
	public Continent getContinent(Long id) {
	return continentRepository.findById(id).get();
	}
	@Override
	public List<Continent> getAllContinents() {
	return continentRepository.findAll();
	}
	@Override
	public Page<Continent> getAllContinentParPage(int page, int size) {
		return continentRepository.findAll(PageRequest.of(page, size));
		
	}
}