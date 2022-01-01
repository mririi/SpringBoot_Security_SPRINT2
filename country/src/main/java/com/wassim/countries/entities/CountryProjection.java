package com.wassim.countries.entities;
import org.springframework.data.rest.core.config.Projection;
@Projection(name = "Name", types = { Country.class })
public interface CountryProjection {
	public String getName();
}
