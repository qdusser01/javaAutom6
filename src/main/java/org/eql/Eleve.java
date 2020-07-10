package org.eql;


public class Eleve {

	private String nom, prenom, commentaire;
	private String date_naissance;
	private int age;
	private boolean demi_pensionnaire;
	private float moyenne, taille;
	private boolean absent;
	private String niveau_classe;


	public Eleve (String nom, String prenom, String date_naissance) {
		this.nom=nom;
		this.prenom=prenom;
		this.date_naissance=date_naissance;
	}
	

	public boolean isAbsent() {
		return absent;
	}


	public void setAbsent(boolean absent) {
		this.absent = absent;
	}


	public String getNiveau_classe() {
		return niveau_classe;
	}


	public void setNiveau_classe(String niveau_classe) {
		this.niveau_classe = niveau_classe;
	}


	public void apprendre() {
	}


}
