package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.entities.lead;

public interface leadRepository extends JpaRepository<lead, Long> {

}
