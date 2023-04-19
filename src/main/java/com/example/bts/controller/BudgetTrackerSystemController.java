package com.example.bts.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.example.bts.entity.BudgetTrackerSystem;
import com.example.bts.service.BudgetTrackerSystemService;

@Controller
public class BudgetTrackerSystemController {
	private BudgetTrackerSystemService budgetTrackerSystemService;

	public BudgetTrackerSystemController (BudgetTrackerSystemService budgetTrackerSystemService) {
		super();
		this.budgetTrackerSystemService = budgetTrackerSystemService;
	}
	
	//handler to handle menu and return model and view
	
	@GetMapping("/BudgetTrackerSystem")
	public String listMenus (Model model) {

		model.addAttribute("BudgetTrackerSystem", budgetTrackerSystemService.getAllBugdetTrackerSystemItems());
		
		return "BudgetTrackerSystem";
	}
}



