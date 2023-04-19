package com.example.bts.service.impl;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bts.entity.BudgetTrackerSystem;
import com.example.bts.repo.BudgetTrackerSystemRepo;
import com.example.bts.service.BudgetTrackerSystemService;

@Service
public class BudgetTrackerSystemServiceImpl implements BudgetTrackerSystemService {

	private BudgetTrackerSystemRepo budgetTrackerSystemRepo;
	
	public BudgetTrackerSystemServiceImpl(BudgetTrackerSystemRepo budgetTrackerSystemRepo) {
		super();
		this.budgetTrackerSystemRepo = budgetTrackerSystemRepo;
	}


	@Override
	public List<BudgetTrackerSystem> getAllBugdetTrackerSystemItems(){
		return budgetTrackerSystemRepo.findAll();
	}
	
}

