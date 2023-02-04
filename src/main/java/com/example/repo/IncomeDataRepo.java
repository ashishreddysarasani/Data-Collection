package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.IncomeDetails;

public interface IncomeDataRepo extends JpaRepository<IncomeDetails, Integer> {

	
}
