package com.wassim.countries.entities;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Continent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idContinent;
	private String Name;
	private int nbCountries;
	private double Surface;
	@JsonIgnore
	@OneToMany(mappedBy = "continent")
	private List<Country> countries;
	public List<Country> getCountries() {
		return countries;
		}
		public void setCountries(List<Country> countries) {
		this.countries = countries;
		}
	public long getIdContinent() {
		return idContinent;
	}
	public void setIdContinent(long idContinent) {
		this.idContinent = idContinent;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getNbCountries() {
		return nbCountries;
	}
	public void setNbCountries(int nbCountries) {
		this.nbCountries = nbCountries;
	}
	public double getSurface() {
		return Surface;
	}
	public void setSurface(double surface) {
		Surface = surface;
	}
	public Continent(long idContinent, String name, int nbCountries, double surface) {
		super();
		this.idContinent = idContinent;
		Name = name;
		this.nbCountries = nbCountries;
		Surface = surface;
	}
	@Override
	public String toString() {
		return "Continent [idContinent=" + idContinent + ", Name=" + Name + ", nbCountries=" + nbCountries
				+ ", Surface=" + Surface + "]";
	}
	
}