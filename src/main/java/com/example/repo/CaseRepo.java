package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.CreateCase;

public interface CaseRepo extends JpaRepository<CreateCase, Integer>{

}
