package com.security.service;
import java.util.ArrayList;
import java.util.List;


import com.security.model.Formation;

public class FormationService {
	
	private List<Formation> formateurs = new ArrayList<Formation>();

	public void addFormation() {
		this.formateurs.add(new Formation(1, "learn angular", "how to learn", "semer"));
	}
	
	public List<Formation> afficherFormation(){
		List<Formation> form = new ArrayList<Formation>();
		for(Formation f : formateurs) {
			form.add(f);
		}
		System.out.println(form);
		return form;
	}

	public List<Formation> getFormateurs() {
		return formateurs;
	}

	public void setFormateurs(List<Formation> formateurs) {
		this.formateurs = formateurs;
	}
	
	

	

}
