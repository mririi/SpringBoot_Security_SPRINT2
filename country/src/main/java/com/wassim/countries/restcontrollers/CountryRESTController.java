package com.wassim.countries.restcontrollers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.wassim.countries.entities.Country;
import com.wassim.countries.services.CountryService;
@RestController
@RequestMapping("/api")
@CrossOrigin
public class CountryRESTController {
@Autowired
CountryService countryService;
@RequestMapping(path = "all",method = RequestMethod.GET)
public List<Country> getAllCountries() {
return countryService.getAllCountries();
}
@RequestMapping(value="/{id}",method = RequestMethod.GET)
public Country getcountryById(@PathVariable("id") Long id) {
return countryService.getCountry(id);

}
@RequestMapping(method = RequestMethod.POST)
public Country createCountry(@RequestBody Country country) {
return countryService.saveCountry(country);
}
@RequestMapping(method = RequestMethod.PUT)
public Country updateCountry(@RequestBody Country country) {
return countryService.updateCountry(country);
}
@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
public void deletecountry(@PathVariable("id") Long id)
{
countryService.deleteCountryById(id);
}
@RequestMapping(value="/countrycont/{id}",method = RequestMethod.GET)
public List<Country> getCountriesByContId(@PathVariable("id") Long id) {
return countryService.findByContinentIdContinent(id);
}
}