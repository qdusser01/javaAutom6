package org.eql;

public final class Ecole {

	public static void augmentation(Enseignant enseignant, int taux) {
		
		enseignant.setSalaires(enseignant.getSalaires()+(enseignant.getSalaires()*taux/100));
	}
	
	public static void augmentation(PersonnelAdministratif admin, int taux) {
		
		admin.setSalaires(admin.getSalaires()+(admin.getSalaires()*taux/100));
	}

}
