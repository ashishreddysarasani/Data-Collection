package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.EducationDetails;
import com.example.model.IncomeDetails;
import com.example.model.KidsDetails;
import com.example.model.PlanDetails;
import com.example.service.DCServiceInterface;

@RestController
public class DCController {

	@Autowired
	private DCServiceInterface dcservice;
	
	@GetMapping("/createcase/{appId}")
	public Integer createCase(@PathVariable Integer appId){
		
		return dcservice.generatecaseId(appId);
	}
	
	@GetMapping("/getallplans")
	public List<PlanDetails> getPlans(){
		
		return dcservice.getallplans();
	}
	
	@PostMapping("/incomedetails")
	public String incomeData(@RequestBody IncomeDetails idetails){
		
		return dcservice.incomedata(idetails);
	}
	
	@PostMapping("/edudetails")
	public String EduData(@RequestBody EducationDetails edetails){
		
		return dcservice.edudata(edetails);
	}
	
	@PostMapping("/kidsdetails")
	public String KidsData(@RequestBody List<KidsDetails> kdetails){
		
		return dcservice.kidsdata(kdetails);
	}
}
