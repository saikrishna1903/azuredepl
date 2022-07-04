package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.login.Details;
import com.example.demo.model.Receipes;
import com.example.demo.service.service;
import java.time.*;
import java.time.format.DateTimeFormatter;


@Controller
public class ReceipesController {
	@Autowired
	service ser;
	@Autowired
	private ingrediantsController ic;
	
	Logger logger =  LoggerFactory.getLogger(ReceipesController.class);
	
	public static boolean z = false;
	@RequestMapping("/")
	public String loginPage() {
		
		return "Login";
	}
	@RequestMapping("/page")
	public String page(Details d) {
		if(d.getUsername().equals("admin") && d.getPassword().equals("Krishna11")) {
			z=true;
			return "redirect:/home";
		}else if(d.getUsername().equals("admin") && d.getPassword().equals("admin")){
			z=false;
			return "redirect:/home";
		}else {
			return "Login";
		}
	}
	 
	@RequestMapping("/add")
	public String addd(Receipes r) {
		logger.info("Added a receipe");
		if(r.getName()==null) {
			
		}else {
			LocalDateTime current = LocalDateTime.now();
			DateTimeFormatter format =DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm"); 
			String formatedDateTime = current.format(format); 
			System.out.println(formatedDateTime);
			r.setDateTime(formatedDateTime);
			ic.ingredientsList(r.getIngredients());
			ser.save(r);
			
		}
		
		return "Homepage";
	}
	@RequestMapping("/home")
	public ModelAndView getall() {
		logger.info("entererd into Home page ");
		ModelAndView mv=new ModelAndView();
		List<Receipes> R= ser.findall();
		mv.addObject("z",z);
		mv.addObject("R",R);
		mv.setViewName("Home");
		return mv;
	}
//	@RequestMapping("/s")
//	public String gat() {
//		logger.info("entered into delete page");
//		return "delete";
//	}
//	
//	@RequestMapping("/delete")
//	public void deletebyid(int id) {
//		logger.info("DELETED "+id+" Deatils");
//		try {
//		ser.delete(id);
//		}catch(Exception e) {
//			System.out.println("No Recipe with ID found");
//		}
//		
//	}
	@RequestMapping("/se/{id}")
	public ModelAndView updatee(@PathVariable int id) {
		if(z) {
		Receipes r=ser.findById(id);
		ModelAndView mv=new ModelAndView();
		mv.addObject("r",r);
		mv.setViewName("update");
		logger.info("UPDATED "+id+" Deatils");
		return mv;
		}
		return null;
	}
	@RequestMapping("/update")
	public String updatevalue(Receipes r) {
		ser.update(r);
		return "redirect:/home";
	}
	@RequestMapping("/delete/{id}")
	public String deleteById(@PathVariable int id) {
		if(z) {
			logger.info("DELETED "+id+" Deatils");
			 ser.delete(id);
		}else {
			
		}
		 return "redirect:/home";

	}
	
	
}
