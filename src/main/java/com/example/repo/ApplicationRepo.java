package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.ApplicantDetails;

public interface ApplicationRepo extends JpaRepository<ApplicantDetails, Integer> {

	public abstract ApplicantDetails findByAppid(Integer appid);
}
