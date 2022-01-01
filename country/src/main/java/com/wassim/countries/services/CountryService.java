package com.wassim.countries.services;

import java.util.List;

import org.springframework.data.domain.Page;

import com.wassim.countries.entities.Continent;
import com.wassim.countries.entities.Country;

public interface CountryService {
	Country saveCountry(Country c);
	Country updateCountry(Country c);
	void deleteCountry(Country c);
	 void deleteCountryById(Long id);
	Country getCountry(Long id);
	List<Country> getAllCountries();
	Page<Country> getAllCountryParPage(int page, int size);
	List<Country> findByName(String nom);
	List<Country> findByNameContains(String nom);
	List<Country> findByNameNbStates(String nom, int nbStates);
	List<Country> findByContinent (Continent continent);
	List<Country> findByContinentIdContinent(Long id);
	List<Country> findByOrderByNameAsc();
	List<Country> trierCountriesNamesNbStates();
}