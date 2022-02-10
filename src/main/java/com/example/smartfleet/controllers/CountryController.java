package com.example.smartfleet.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.smartfleet.models.Country;
import com.example.smartfleet.services.CountryService;

@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping("/countries")
	public String findAll(Model model){		
		model.addAttribute("countries", countryService.findAll());
		return "globals/countries";
	}
	
	@PostMapping("/countries/addCountry")
	public String addCountry(Country country){		
		countryService.save(country);
		return "redirect:/countries";
	}
	
	@GetMapping("/countries/edit")
	public Optional<Country> findById(Integer id){		
		return countryService.findById(id);
	}
	
	
		
}
