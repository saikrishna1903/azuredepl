package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.controller.ReceipesController;
import com.example.demo.dao.Repo;
import com.example.demo.dao.ingrepo;
import com.example.demo.model.Receipes;
import com.example.demo.model.ingredients;

@Component
public class service {

	@Autowired
	Repo repo;
	@Autowired
	ingrepo ingrep;


	public void save(Receipes r) {
		repo.save(r);
	}
	public void save(ingredients r) {
		ingrep.save(r);
	}

	public List<Receipes> findall() {
		return (List<Receipes>) repo.findAll();
	}

	public void delete(int id) {
		repo.deleteById(id);
	}
	public void update(Receipes r) {
		//		Receipes f=repo.findById(id).get();
		//		f.setCookingInstructions(r.getCookingInstructions());
		//		f.setDateTime(f.getDateTime());
		//		f.setIngredients(f.getIngredients());
		//		f.setName(f.getName());
		//		f.setSuitableFor(f.getSuitableFor());
		//		f.setTypeOfDish(f.getTypeOfDish());

		repo.save(r);
	}

	public Receipes findById(int id) {
		return repo.findById(id).get();
	}

}
