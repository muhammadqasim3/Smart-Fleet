package com.example.smartfleet.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@ResponseBody
	public Optional<Country> findById(Integer id){		
		return countryService.findById(id);
	}
	
	
	@RequestMapping(value="/countries/delete", method= {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer id) {
		countryService.delete(id);
		return "redirect:/countries";
	}
	
		
}
