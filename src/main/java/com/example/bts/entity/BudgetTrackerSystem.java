package com.example.bts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "BudgetTrackerSystem")
public class BudgetTrackerSystem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "date", nullable = false)
	private String date;
	
	@Column(name = "category", nullable = false)
	private String category;
	
	@Column(name = "description", nullable = false)
	private String description;
	
	@Column(name = "amount", nullable = false)
	private long amount;
	
	public BudgetTrackerSystem() {};

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public BudgetTrackerSystem(String date, String category, String description, long amount) {
		super();
		this.date = date;
		this.category = category;
		this.description = description;
		this.amount = amount;
	}
	
	
	
}








	
