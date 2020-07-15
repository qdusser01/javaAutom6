package org.eql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Eleve extends Personne {

	 static Logger logger = LoggerFactory.getLogger(Eleve.class);

	
	private String commentaire;
	private String date_naissance;
	private int age;
	private boolean demi_pensionnaire;
	private float moyenne, taille;
	private boolean absent;
	private NiveauClasse niveau_classe;


	public Eleve (String nom, String prenom, String date_naissance) {
		super(nom,prenom);
		this.date_naissance=date_naissance; 
	}
	
	
	public Eleve (String nom, String prenom, int age) throws AgeEleveException {
		super(nom,prenom);
		if(age<6) {
			logger.error("l'éleve est trop jeune");
			throw new AgeEleveException("yo");
		}
		else if (age>10) {
			throw new AgeEleveException("l'éleve est trop agé");
		}
		
		this.age=age;
		
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isAbsent() {
		return absent;
	}


	public void setAbsent(boolean absent) {
		this.absent = absent;
	}


	public NiveauClasse getNiveau_classe() {
		return niveau_classe;
	}


	public void setNiveau_classe(NiveauClasse niveau_classe) {
		this.niveau_classe = niveau_classe;
	}


	public void apprendre() {
	}


}
