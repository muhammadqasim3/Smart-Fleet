package com.example.smartfleet.smartfleet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	
	@GetMapping("index")
	public String index() {
//		return "dashboard/_layout";
		return "index";
	}

}
