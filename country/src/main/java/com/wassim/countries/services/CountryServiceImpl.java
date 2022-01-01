package com.wassim.countries.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.wassim.countries.entities.Continent;
import com.wassim.countries.entities.Country;
import com.wassim.countries.repos.CountryRepository;
@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	CountryRepository countryRepository;
	@Override
	public Country saveCountry(Country c) {
	return countryRepository.save(c);
	}
	@Override
	public Country updateCountry(Country c) {
	return countryRepository.save(c);
	}
	@Override
	public void deleteCountry(Country c) {
	countryRepository.delete(c);
	}
	 @Override
	public void deleteCountryById(Long id) {
	countryRepository.deleteById(id);
	}
	@Override
	public Country getCountry(Long id) {
	return countryRepository.findById(id).get();
	}
	@Override
	public List<Country> getAllCountries() {
	return countryRepository.findAll();
	}
	@Override
	public Page<Country> getAllCountryParPage(int page, int size) {
		return countryRepository.findAll(PageRequest.of(page, size));
		
	}
	@Override
	public List<Country> findByName(String nom) {
	return countryRepository.findByName(nom);
	}
	@Override
	public List<Country> findByNameContains(String nom) {
	return countryRepository.findByNameContains(nom);
	}
	@Override
	public List<Country> findByNameNbStates(String nom, int nbStates) {
		return countryRepository.findByNameNbStates(nom, nbStates);
		}
		@Override
		public List<Country> findByContinent(Continent continent) {
		return countryRepository.findByContinent(continent);
		}
		@Override
		public List<Country> findByContinentIdContinent(Long id) {
		return countryRepository.findByContinentIdContinent(id);
		}
		@Override
		public List<Country> findByOrderByNameAsc() {
		return countryRepository.findByOrderByNameAsc();
		}
		@Override
		public List<Country> trierCountriesNamesNbStates() {
		return countryRepository.trierCountriesNamesNbStates();
		}
	}
