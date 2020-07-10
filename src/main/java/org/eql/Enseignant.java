package org.eql;

public class Enseignant {
	//Création de 4 variables d'instances
	private String nom, prenom, poste;
	private int nb_absences_mois_en_cours;
	private float salaires;
	
	//Méthodes getter et setter pour les variables "salaires" et "nb_abs..."
	public int getNb_absences_mois_en_cours() {
		return nb_absences_mois_en_cours;
	}
	public void setNb_absences_mois_en_cours(int nb_absences_mois_en_cours) {
		this.nb_absences_mois_en_cours = nb_absences_mois_en_cours;
	}

	public float getSalaires() {
		return salaires;
	}
	public void setSalaires(float salaires) {
		this.salaires = salaires;
	}
	
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	
	//Constructeur
	public Enseignant(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	//Méthode "sePresenter"
	public void sePresenter() {
		System.out.println("Bonjour, je m'appelle "+this.prenom+" "+this.nom+".\nJe suis professeur de "+this.poste+" et je gagne "+this.salaires+" euros.");
	}

}
