package org.eql;

public interface IEmployeEcole {
	void sePresenter();
	void setSalaires(float f);
	void setPoste(String s);
	String getPoste();
	float getSalaires();
	int getNb_absences_mois_en_cours();
	void setNb_absences_mois_en_cours(int i);
	void demanderAugmentation (int taux);
	
}
