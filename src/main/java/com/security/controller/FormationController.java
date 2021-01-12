package com.security.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.security.model.Formation;
import com.security.repository.FormationRepository;
import com.security.service.FormationService;

@RestController
public class FormationController {
	
	@Autowired
	FormationRepository formRepo;
	
	//by constructor
	FormationRepository repository;
	public FormationController(FormationRepository r) {
		this.repository = r;
	}
	
	//by setter
	
	public void seRepository(FormationRepository r) {
		this.repository = r;
	}
	
	@GetMapping
	public String hello() {
		return "hello world";
	}
	
	@GetMapping("/welcome")
	public ModelAndView welcome() {
		return new ModelAndView("home.html");
	}
	
	@RequestMapping(value = "/listeFormateur", method = RequestMethod.GET,
            produces = "application/json")
	
	public String displayFormateurList() {
		FormationService form = new FormationService();
		Formation f = new Formation(1, "title", "description", "formateur");
		List<Formation> formations = new ArrayList<Formation>();
		formations.add(f);
		return formations.toString();
	}
}
