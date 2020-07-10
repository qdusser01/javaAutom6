package org.eql;

public class PersonnelAdministratif {
	//Création de 4 variables d'instances
	private String nom, prenom;
	private int nb_absences_mois_en_cours;
	private float salaires;
	private String poste;
	
	//Méthodes getter et setter pour les variables "salaires" et "nb_abs..."
	public int getNb_absences_mois_en_cours() {
		return nb_absences_mois_en_cours;
	}
	
	/**
	 * Cette méthode permet de renseigner le nombre d'absence du prof
	 * @param (int) nb_absences_mois_en_cours = le nombre d'absence du professeur
	 */
	public void setNb_absences_mois_en_cours(int nb_absences_mois_en_cours) {
		this.nb_absences_mois_en_cours = nb_absences_mois_en_cours;
	}

	public float getSalaires() {
		return salaires;
	}
	public void setSalaires(float salaires) {
		this.salaires = salaires;
	}

	//Constructeur avec deux paramètres qui renseigneraient les variables « nom » et « prenom » à l’instanciation
	public PersonnelAdministratif(String nom, String prenom) {
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public String getPoste() {
		return poste;
	}
	public void setPoste(String poste) {
		this.poste = poste;
	}
	
	//Méthode "sePresenter"
		public void sePresenter() {
			System.out.println("Bonjour, je m'appelle "+this.prenom+" "+this.nom+".\nJe suis "+this.poste+" et je gagne "+this.salaires+" euros.");
		}

}
