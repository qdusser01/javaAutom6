package org.eql;

public class Enseignant extends Personne implements IEmployeEcole{
	//Création de 4 variables d'instances
	private String POSTE= "enseignant";
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
		return POSTE;
	}
	public void setPoste(String poste) {
		this.POSTE = poste;
	}
	
	//Constructeur
	public Enseignant(String nom, String prenom) {
		super(nom,prenom);
	}
	
	//Méthode "sePresenter"
	public void sePresenter() {
		System.out.println("Bonjour, je m'appelle "+this.prenom+" "+this.nom+".\nJe suis professeur de "+this.POSTE+" et je gagne "+this.salaires+" euros.");
	}

}
