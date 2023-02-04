package com.example.service;

import java.util.List;

import com.example.model.EducationDetails;
import com.example.model.IncomeDetails;
import com.example.model.KidsDetails;
import com.example.model.PlanDetails;
public interface DCServiceInterface {

	public Integer generatecaseId(Integer appid);
	public List<PlanDetails> getallplans();
	public String incomedata(IncomeDetails idetails);
	public String edudata(EducationDetails edetails);
	public String kidsdata(List<KidsDetails> kdetails);
	
}
