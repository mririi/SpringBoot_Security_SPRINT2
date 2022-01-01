package com.wassim.countries;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.wassim.countries.entities.Continent;
import com.wassim.countries.entities.Country;
import com.wassim.countries.repos.CountryRepository;
import com.wassim.countries.services.CountryService;
@SpringBootTest
class CountryApplicationTests {

	@Autowired
	private CountryRepository countryRepository;
	@Autowired
	private CountryService countryService;
	@Test
	public void testCreateCountry() {
	
	//Country countryy = new Country("Tunisia",24,LocalDate.of( 1956 , 3 , 20 ));
	Country countryy = new Country("Algerie",25,new Date());

	countryRepository.save(countryy);
	}
	@Test
	public void testFindCountry()
	{
	Country c = countryRepository.findById(1L).get();
	System.out.println(c);
	}
	@Test
	public void testUpdateCountry()
	{
	Country c = countryRepository.findById(1L).get();
	c.setNbStates(26);
	countryRepository.save(c);
	}
	@Test
	public void testDeleteCountry()
	{
	countryRepository.deleteById(2L);;
	}

	@Test
	public void testListerTousCountries()
	{
	List<Country> countries = countryRepository.findAll();
	for (Country c : countries)
	{
	System.out.println(c);
	}
	}
	@Test
	public void testFindByName()
	{
	List<Country> countries = countryRepository.findByName("Tunisia");

	for (Country c : countries)
	{
	System.out.println(c);
	}

	}
	@Test
	public void testFindByNameContains()
	{
	Page<Country> countries = countryService.getAllCountryParPage(0, 2);
	System.out.println(countries.getSize());
	System.out.println(countries.getTotalElements());
	System.out.println(countries.getTotalPages());
	countries.getContent().forEach(e -> {System.out.println(e.toString());
	});
	/*
	for (Country c : countries)
	{
	System.out.println(c);
	} */
	}
	@Test
	public void testfindByNameNbStates()
	{
	List<Country> countries = countryRepository.findByNameNbStates("Tunisia", 26);
	for (Country p : countries)
	{
	System.out.println(p);
	}
	}
	
	@Test
	public void testfindByContinent()
	{
	Continent con = new Continent();
	con.setIdContinent(2L);
	List<Country> countries = countryRepository.findByContinent(con);
	for (Country p : countries)
	{
	System.out.println(p);
	}

	}

	@Test
	public void testfindByContinentIdContinent()
	{
	List<Country> countries = countryRepository.findByContinentIdContinent(1L);
	for (Country p : countries)
	{
	System.out.println(p);
	}

	}
	@Test
	public void findByOrderByNameAsc()
	{
	List<Country> countries =countryRepository.findByOrderByNameAsc();
	for (Country p : countries)
	{
	System.out.println(p);
	}

	}
	@Test
	public void trierCountriesNamesNbStates()
	{
	List<Country> countries = countryRepository.trierCountriesNamesNbStates();
	for (Country p : countries)
	{
	System.out.println(p);
	}

	}
}