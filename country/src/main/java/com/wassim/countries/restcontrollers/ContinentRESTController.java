package com.wassim.countries.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wassim.countries.entities.Continent;
import com.wassim.countries.services.ContinentService;

@RestController
@RequestMapping("/api/continent/")
@CrossOrigin
public class ContinentRESTController {
	
	@Autowired
	ContinentService continentService;
	@RequestMapping(path = "all",method = RequestMethod.GET)
	public List<Continent> getAllContinents() {
	return continentService.getAllContinents();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Continent getcontinentById(@PathVariable("id") Long id) {
	return continentService.getContinent(id);

	}
	@RequestMapping(method = RequestMethod.POST)
	public Continent createContinent(@RequestBody Continent continent) {
	return continentService.saveContinent(continent);
	}
	@RequestMapping(method = RequestMethod.PUT)
	public Continent updateContinent(@RequestBody Continent continent) {
	return continentService.updateContinent(continent);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deletecontinent(@PathVariable("id") Long id)
	{
	continentService.deleteContinentById(id);
	}
	}
