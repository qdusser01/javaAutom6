package org.eql;

public final class Ecole {

	public static void augmentation(IEmployeEcole ie, int taux) {

		ie.setSalaires(ie.getSalaires() + (ie.getSalaires() * taux / 100));
	}

	public static void augmentationConditionnelle(IEmployeEcole ie, int taux) {
		if (ie.getNb_absences_mois_en_cours() < 4) {
			ie.setSalaires(ie.getSalaires() + (ie.getSalaires() * taux / 100));
			System.out.println("Augmentation accordée");
		}

		else {
			System.out.println("Pas d'augmentation");
		}
	}

	public static void assignerClasseEleve(Eleve e) {
		switch (e.getAge()) {
		case 6:
			e.setNiveau_classe(NiveauClasse.CP);
			System.out.println("niveau classe de l'éleve : CP");
			break;
		case 7:
			e.setNiveau_classe(NiveauClasse.CE1);
			System.out.println("niveau classe de l'éleve : CE1");
			break;
		case 8:
			e.setNiveau_classe(NiveauClasse.CE2);
			System.out.println("niveau classe de l'éleve : CE2");
			break;
		case 9:
			e.setNiveau_classe(NiveauClasse.CM1);
			System.out.println("niveau classe de l'éleve : CM1");
			break;
		case 10:
			e.setNiveau_classe(NiveauClasse.CM2);
			System.out.println("niveau classe de l'éleve : CM1");
			break;
		default : System.out.println("cet éleve n'est pas en primaire");
		
		}

	}

}
