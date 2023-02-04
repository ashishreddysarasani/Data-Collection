package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.CreateCase;
import com.example.model.EducationDetails;
import com.example.model.IncomeDetails;
import com.example.model.KidsDetails;
import com.example.model.PlanDetails;
import com.example.repo.ApplicationRepo;
import com.example.repo.CaseRepo;
import com.example.repo.EduDataRepo;
import com.example.repo.IncomeDataRepo;
import com.example.repo.KidsDataRepo;
import com.example.repo.PlanDetailsRepo;

@Service
public class DCServiceImpl implements DCServiceInterface{

	@Autowired
	private CaseRepo crepo;
	@Autowired
	private EduDataRepo erepo;
	@Autowired
	private IncomeDataRepo idatarepo;
	@Autowired
	private KidsDataRepo krepo;
	@Autowired
	private PlanDetailsRepo prepo;
	
	@Autowired
	private ApplicationRepo ar;
	
	@Override
	public Integer generatecaseId(Integer appid) {
		// TODO Auto-generated method stub
		
		if(ar.findByAppid(appid)!=null)
			return crepo.save(new CreateCase(1,appid,1)).getAppid();
		
		return -1;
	}

	@Override
	public List<PlanDetails> getallplans() {
		// TODO Auto-generated method stub
		
		return prepo.getAllplans();
	}

	@Override
	public String incomedata(IncomeDetails idetails) {
		// TODO Auto-generated method stub
		if(idatarepo.save(idetails)!=null)
			return "saved";
		return "already exits";
	}

	@Override
	public String edudata(EducationDetails edetails) {
		// TODO Auto-generated method stub
		if(erepo.save(edetails)!=null)
			return "saved";
		return "already exits";
	
	}

	@Override
	public String kidsdata(List<KidsDetails> kdetails) {
		// TODO Auto-generated method stub
		if(krepo.saveAll(kdetails)!=null)
			return "your kids saved";
		return "already exits";
	}

}
