package com.example.smartfleet.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smartfleet.models.Country;
import com.example.smartfleet.repositories.CountryRepository;

@Service
public class CountryService {

	@Autowired
	private CountryRepository countryRepository;
	

	public List<Country> findAll() {
		List<Country> countries = countryRepository.findAll();
		return countryRepository.findAll();
	}


	public void save(Country country) {
		countryRepository.save(country);
	}


	public Optional<Country> findById(Integer id) {
		System.out.println("HELLLLo  = "+ countryRepository.findById(id));
		return countryRepository.findById(id);
	}
	
	public void delete(Integer id) {
		countryRepository.deleteById(id);
	}

}
