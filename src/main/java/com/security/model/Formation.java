package com.security.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="formation")
public class Formation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	private String titre;
	
	@Column(nullable= true, length = 100)
	private String description;
	
	@Column(unique = true, length = 30)
	private String formateur;
	
	

	public Formation(long id, @NotBlank String titre, String description, String formateur) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.formateur = formateur;
	}
	
	



	@Override
	public String toString() {
		return "Formation [id=" + id + ", titre=" + titre + ", description=" + description + ", formateur=" + formateur
				+ "]";
	}
	

}
