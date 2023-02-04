package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.EducationDetails;

public interface EduDataRepo extends JpaRepository<EducationDetails, Integer>{

}
