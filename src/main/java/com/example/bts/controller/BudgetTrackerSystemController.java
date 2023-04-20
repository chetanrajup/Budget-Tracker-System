package com.example.bts.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	//handler to handle and return model and view
	
	@GetMapping("/BudgetTrackerSystem")
	public String listMenus (Model model) {

		model.addAttribute("BudgetTrackerSystem", budgetTrackerSystemService.getAllBugdetTrackerSystemItems());
		
		return "BudgetTrackerSystem";
	}
	
	@GetMapping("/BudgetTrackerSystem/add")
	public String createForm( Model model ) {
		
		//create obj to hold form data
		BudgetTrackerSystem budgetTrackerSystem = new BudgetTrackerSystem();
		model.addAttribute("budgetTrackerSystem", budgetTrackerSystem);
		return "create_record";
		
	}
	
	@PostMapping("/BudgetTrackerSystem")
	public String saveRecord( @ModelAttribute("budgetTrackerSystem") BudgetTrackerSystem budgetTrackerSystem) {
		budgetTrackerSystemService.saveRecord(budgetTrackerSystem);
		return "redirect:/BudgetTrackerSystem";	
	}
	
	//update
	
	@GetMapping("/BudgetTrackerSystem/update/{id}")
	public String editRecord(@PathVariable Long id, Model model) {
		model.addAttribute("budgetTrackerSystem", budgetTrackerSystemService.getRecordById(id));
		return "update_record";
	}
	
	@PostMapping("/BudgetTrackerSystem/{id}")
	public String update( @PathVariable Long id, @ModelAttribute("budgetTrackerSystem") BudgetTrackerSystem budgetTrackerSystem, Model model) {
		
		//get record by id
		BudgetTrackerSystem existingRecord = budgetTrackerSystemService.getRecordById(id);
		existingRecord.setId(id);
		existingRecord.setDate(budgetTrackerSystem.getDate());
		existingRecord.setCategory(budgetTrackerSystem.getCategory());
		existingRecord.setDescription(budgetTrackerSystem.getDescription());
		existingRecord.setAmount(budgetTrackerSystem.getAmount());
		
		//save
		budgetTrackerSystemService.updateRecord(existingRecord);
		return "redirect:/BudgetTrackerSystem";
	}
	
	//delete
	
	@GetMapping("/BudgetTrackerSystem/{id}")
	public String deleteRecord(@PathVariable Long id) {
		budgetTrackerSystemService.deleteRecordById(id);
		return "redirect:/BudgetTrackerSystem";
	}
	
	
}



