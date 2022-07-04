package com.example.demo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;



@Entity
public @Data class Receipes {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String DateTime;
	private String TypeOfDish;
	private int SuitableFor;

//	@OneToOne(cascade=CascadeType.ALL,targetEntity=ingredients.class)
//	@JoinColumn(name="ing_id")
	String Ingredients;
	private String CookingInstructions;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String toString() {
		

		return "Receipes [id=" + id + ", name=" + name + ", DateTime=" + DateTime + ", TypeOfDish=" + TypeOfDish
				+ ", SuitableFor=" + SuitableFor + ", Ingredients=" + Ingredients + ", CookingInstructions="
				+ CookingInstructions + "]";


	}
	
	public List<String> getList(){
		String s="" + id + "," + name + "," + DateTime + "," + TypeOfDish
				+ "," + SuitableFor + "," + Ingredients + ","
				+ CookingInstructions;
		List<String> list=new ArrayList<String>(Arrays.asList(s.split(",")));
		return list;
	}

	public List<String> getvaluess(String h){

		ArrayList<String> l=new ArrayList<String>();
		String d="";
		for(int i=0;i<h.length();i++) {

			if(h.charAt(i)=='.') {
				l.add(d);
				d="";

			}else {
				d=d+h.charAt(i);
			}


		}
		return l;
	}
}
