package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.Receipes;
import com.example.demo.model.ingredients;
import com.example.demo.service.service;

@Controller
public class ingrediantsController {
	@Autowired
	service ser;
	static int c=0;
    @RequestMapping("/ing")
	public void ingredientsList(String s) {
		Receipes r=new Receipes();
		List<String> l=r.getvaluess(s);
		
		for(String i:l) {
			c+=1;
			ingredients in=new ingredients();
			in.setIng_id(c);
			in.setIng_name(i);
			ser.save(in);
		}


	}

}
