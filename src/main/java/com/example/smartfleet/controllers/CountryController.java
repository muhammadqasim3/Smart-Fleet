package com.example.smartfleet.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
		
}
