package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.KidsDetails;

public interface KidsDataRepo extends JpaRepository<KidsDetails, Integer>{

}
