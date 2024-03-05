package com.petmanagementsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pet {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

    private String name;
    private int age;
    private String breed;
    private String description;
    
	public Pet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Pet(int id, String name, int age, String breed, String description) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.breed = breed;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", name=" + name + ", age=" + age + ", breed=" + breed + ", description=" + description
				+ "]";
	}
    

}
