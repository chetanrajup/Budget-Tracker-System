package com.example.bts.service;
import java.util.*;
import com.example.bts.entity.*;



public interface BudgetTrackerSystemService {
	List<BudgetTrackerSystem> getAllBugdetTrackerSystemItems();
	
	 BudgetTrackerSystem saveRecord( BudgetTrackerSystem budgetTrackerSystem );
	 
	 BudgetTrackerSystem getRecordById(Long id);
	 
	 BudgetTrackerSystem updateRecord(BudgetTrackerSystem budgetTrackerSystem);
	 
	 void deleteRecordById(Long id);
}