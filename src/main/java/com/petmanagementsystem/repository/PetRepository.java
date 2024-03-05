package com.petmanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.petmanagementsystem.model.Pet;

public interface PetRepository extends JpaRepository<Pet,Integer>{

}
