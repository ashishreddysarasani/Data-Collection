package com.example.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.model.PlanDetails;

public interface PlanDetailsRepo extends JpaRepository<PlanDetails, Integer>{

	@Query("select pd from PlanDetails pd")
	public abstract List<PlanDetails> getAllplans();
}
