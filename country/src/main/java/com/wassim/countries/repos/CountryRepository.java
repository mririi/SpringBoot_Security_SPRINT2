package com.wassim.countries.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.wassim.countries.entities.Continent;
import com.wassim.countries.entities.Country;

@RepositoryRestResource(path = "rest")
public interface CountryRepository extends JpaRepository<Country, Long> {
	List<Country> findByName(String name);
	List<Country> findByNameContains(String name);
	@Query("select p from Country p where p.name like %?1 and p.nbStates > ?2")
	List<Country> findByNameNbStates (String nom, int nbstates);
	@Query("select p from Country p where p.continent = ?1")
	List<Country> findByContinent (Continent continent);
	List<Country> findByContinentIdContinent(Long id);
	List<Country> findByOrderByNameAsc();
	@Query("select p from Country p order by p.name ASC, p.nbStates DESC")
	List<Country> trierCountriesNamesNbStates ();
	
}