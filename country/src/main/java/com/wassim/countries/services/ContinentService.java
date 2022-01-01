package com.wassim.countries.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.wassim.countries.entities.Continent;

public interface ContinentService {
	Continent saveContinent(Continent c);
	Continent updateContinent(Continent c);
	void deleteContinent(Continent c);
	 void deleteContinentById(Long id);
	Continent getContinent(Long id);
	List<Continent> getAllContinents();
	Page<Continent> getAllContinentParPage(int page, int size);
}