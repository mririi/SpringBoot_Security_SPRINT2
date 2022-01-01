package com.wassim.countries.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCountry;
	private String name;
	private int nbStates;
	private Date foundedIn;
	@ManyToOne
	private Continent continent;
	public long getIdCountry() {
		return idCountry;
	}
	public void setIdCountry(long idCountry) {
		this.idCountry = idCountry;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNbStates() {
		return nbStates;
	}
	public void setNbStates(int nbStates) {
		this.nbStates = nbStates;
	}
	public Date getFoundedIn() {
		return foundedIn;
	}
	public void setFoundedIn(Date foundedIn) {
		this.foundedIn = foundedIn;
	}
	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Country(String name, int i, Date date) {
		super();
		this.name = name;
		this.nbStates = i;
		this.foundedIn = date;
	}
	public Continent getContinent() {
		return continent;
	}
	public void setContinent(Continent continent) {
		this.continent = continent;
	}
	@Override
	public String toString() {
		return "Country [idCountry=" + idCountry + ", name=" + name + ", nbStates=" + nbStates + ",foundedin= "+foundedIn+ "]";
	}
	
	
	
}