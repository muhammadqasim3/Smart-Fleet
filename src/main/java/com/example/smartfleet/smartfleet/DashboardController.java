package com.example.smartfleet.smartfleet;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	
	@GetMapping("index")
	public String index() {
		return "_layout";
	}
	
	@GetMapping("hr")
	public String hr() {
		return "hr/index";
	}
	
	@GetMapping("accounts")
	public String accounts() {
		return "accounts/index";
	}
	
	@GetMapping("fleets")
	public String fleets() {
		return "fleets/index";
	}
	
	@GetMapping("payroll")
	public String payroll() {
		return "payroll/index";
	}
	
	@GetMapping("helpdesk")
	public String helpdesk() {
		return "helpdesk/index";
	}
	
	@GetMapping("settings")
	public String settings() {
		return "settings/index";
	}

}
