package com.petmanagementsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petmanagementsystem.model.Pet;
import com.petmanagementsystem.service.PetService;

@RestController
@RequestMapping("/pets")
public class PetController {
	@Autowired
	private PetService petService;
	@GetMapping("/allpets")
    public ResponseEntity<List<Pet>> getAllPets() {
        List<Pet> pets = petService.getAllPets();
        return new ResponseEntity<>(pets, HttpStatus.OK);
    }
	 @PostMapping("/added")
	    public ResponseEntity<Pet> createPet(@RequestBody Pet pet) {
	        Pet createdPet = petService.createPet(pet);
	        return new ResponseEntity<>(createdPet, HttpStatus.CREATED);
	    }
	 @PutMapping("/updated/{id}")
	    public ResponseEntity<Pet> updatePet(@PathVariable int id, @RequestBody Pet petDetails) {
	        Pet updatedPet = petService.updatePet(id, petDetails);
	        return updatedPet != null ? ResponseEntity.ok(updatedPet) : ResponseEntity.notFound().build();
	    }
	 @DeleteMapping("/deleted/{id}")
	    public ResponseEntity<Pet> deletePet(@PathVariable int id) {
	        petService.deletePet(id);
	        return ResponseEntity.noContent().build();
	    }

}
