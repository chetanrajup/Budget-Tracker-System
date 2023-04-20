package com.example.bts;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.bts.entity.BudgetTrackerSystem;
import com.example.bts.repo.BudgetTrackerSystemRepo;

@SpringBootApplication
public class BudgetTrackerSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(BudgetTrackerSystemApplication.class, args);
	}
	
	@Autowired
	private BudgetTrackerSystemRepo budgetTrackerSystemRepo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
//		BudgetTrackerSystem budgetTrackerSystem1 = new BudgetTrackerSystem("18/04/2023", "Food", "Breakfast", 1000);
//		budgetTrackerSystemRepo.save(budgetTrackerSystem1);
	}

}
