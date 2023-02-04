package com.example.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.model.ApplicantDetails;
import com.example.model.PlanDetails;
import com.example.repo.ApplicationRepo;
import com.example.repo.PlanDetailsRepo;

@Component
public class OnStartRunners implements CommandLineRunner {

	@Autowired
	private ApplicationRepo arepo;
	
	@Autowired 
	private PlanDetailsRepo prepo;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		arepo.saveAll(
				//Arrays.asList( //JDK 1.2
				List.of( //JDK 9	
						new ApplicantDetails(1,1234569870l,"ashishreddy56@gmail.com"),
						new ApplicantDetails(2,9876454370l,"ashish@gmail.com"),
						new ApplicantDetails(3,7654569870l,"reddy56@gmail.com")
						//new ApplicantDetails(1,9876543211L, "ashishreddy56789@gmail.com"),
						)
				);	
		prepo.saveAll(List.of(
				new PlanDetails(1, "ccap"),
				new PlanDetails(2, "snap"),
				new PlanDetails(3, "RIW")));
	}

}
