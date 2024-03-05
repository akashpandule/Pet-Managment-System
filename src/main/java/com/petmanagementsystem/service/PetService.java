package com.petmanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.petmanagementsystem.model.Pet;
import com.petmanagementsystem.repository.PetRepository;

@Service
public class PetService {
	@Autowired
	private PetRepository petRepository;
	public List<Pet> getAllPets() {
        return petRepository.findAll();
    }
	  public Pet createPet(Pet pet) {
	        return petRepository.save(pet);
	    }
	  public Pet updatePet(int id, Pet petDetails) {
	        Optional<Pet> optionalPet = petRepository.findById(id);
	        if (optionalPet.isPresent()) {
	            Pet pet = optionalPet.get();
	            pet.setName(petDetails.getName());
	            pet.setAge(petDetails.getAge());
	            pet.setBreed(petDetails.getBreed());
	            pet.setDescription(petDetails.getDescription());
	            return petRepository.save(pet);
	        } else {
	            System.out.println("pet Not founf !");
	            return null;
	        }
	    }
	  public void deletePet(int id) {
	        petRepository.deleteById(id);
	    }
	

}
