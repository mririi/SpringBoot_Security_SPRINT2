package com.wassim.countries.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.wassim.countries.entities.Continent;
@RepositoryRestResource(path = "rest")
public interface ContinentRepository extends JpaRepository<Continent, Long> {
	/*List<Continent> findByName(String name);
	List<Continent> findByNameContains(String name);
	@Query("select p from Continent p where p.name like %?1 and p.Surface > ?2")
	List<Continent> findByNameSurface (String name, int surface);
	@Query("select p from Continent p where p.country = ?1")
	List<Continent> findByCountry (Continent continent);
	List<Continent> findByCountryId(Long id);
	List<Continent> findByOrderByNameAsc();
	@Query("select p from Continent p order by p.name ASC, p.Surface DESC")
	List<Continent> trierContinentNamesSurface ();
	*/
}