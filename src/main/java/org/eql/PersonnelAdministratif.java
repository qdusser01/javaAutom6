package org.eql;

public class PersonnelAdministratif extends Personne implements IEmployeEcole {
	//Création de 4 variables d'instances
	private int nb_absences_mois_en_cours;
	private float salaires;
	private String POSTE="Personnel Administratif";
	
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
		super(nom,prenom);
	}
	
	public String getPoste() {
		return POSTE;
	}
	public void setPoste(String poste) {
		this.POSTE = poste;
	}
	
	//Méthode "sePresenter"
		public void sePresenter() {
			System.out.println("Bonjour, je m'appelle "+this.prenom+" "+this.nom+".\nJe suis "+this.POSTE+" et je gagne "+this.salaires+" euros.");
		}

}
